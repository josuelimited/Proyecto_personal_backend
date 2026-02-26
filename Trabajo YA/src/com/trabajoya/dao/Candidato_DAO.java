package com.trabajoya.dao;

import com.trabajoya.modelo.Candidatos;
import com.trabajoya.repositorio.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Candidato_DAO {

    // 1. REGISTRAR PERFIL DE CANDIDATO
    public boolean registrar(Candidatos candidato) {
        String sql = "INSERT INTO candidatos (id_usuario, estado_candidato, habilidades, experiencia, curriculum) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, candidato.getIdUsuario());
            ps.setBoolean(2, candidato.isEstadoCandidato());
            ps.setString(3, candidato.getHabilidades());
            ps.setString(4, candidato.getExperiencia());
            ps.setString(5, candidato.getCurriculum());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al registrar perfil de candidato: " + e.getMessage());
            return false;
        }
    }

    // 2. BUSCAR CANDIDATO POR ID DE USUARIO
    public Candidatos buscarPorUsuario(int idUsuario) {
        String sql = "SELECT * FROM candidatos WHERE id_usuario = ?";

        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Candidatos c = new Candidatos();
                    c.setIdCandidato(rs.getInt("id_candidato"));
                    c.setIdUsuario(rs.getInt("id_usuario"));
                    c.setEstadoCandidato(rs.getBoolean("estado_candidato"));
                    c.setHabilidades(rs.getString("habilidades"));
                    c.setExperiencia(rs.getString("experiencia"));
                    c.setCurriculum(rs.getString("curriculum"));
                    return c;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar candidato: " + e.getMessage());
        }
        return null;
    }
}