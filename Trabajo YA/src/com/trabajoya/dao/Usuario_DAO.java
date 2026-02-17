package com.trabajoya.dao;

import com.trabajoya.modelo.Usuario;
import com.trabajoya.repositorio.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Usuario_DAO {

    // MÉTODO PARA REGISTRAR
    public boolean registrar(Usuario usuario) {
        String sql = "INSERT INTO usuario (id_rol, nombre, email, telefono, password, fecha_de_registro) VALUES (?, ?, ?, ?, ?, ?)";

        // Abrimos la conexión y preparamos la sentencia
        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Si 'ps' te daba error antes, era porque no estaba dentro de este try
            ps.setInt(1, usuario.getIdRol());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getTelefono());
            ps.setString(5, usuario.getPassword());
            ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            int resultado = ps.executeUpdate();
            return resultado > 0;

        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }

    // MÉTODO PARA LOGIN
    public Usuario login(String email, String password) {
        String sql = "SELECT * FROM usuario WHERE email = ? AND password = ?";

        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Creamos el objeto con los datos de la tabla
                    Usuario u = new Usuario();
                    u.setIdUsuario(rs.getInt("id_usuario"));
                    u.setIdRol(rs.getInt("id_rol"));
                    u.setNombre(rs.getString("nombre"));
                    u.setEmail(rs.getString("email"));
                    u.setTelefono(rs.getString("telefono"));
                    u.setPassword(rs.getString("password"));
                    u.setFechaDeRegistro(rs.getTimestamp("fecha_de_registro"));
                    return u;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en login: " + e.getMessage());
        }
        return null;
    }
}