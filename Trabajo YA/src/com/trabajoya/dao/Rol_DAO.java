package com.trabajoya.dao;

import com.trabajoya.modelo.Rol;
import com.trabajoya.repositorio.ConexionDB; // Importas tu conexión desde repositorio
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Rol_DAO {

    // Método para listar todos los roles (útil para desplegables en el front)
    public List<Rol> listar() {
        List<Rol> lista = new ArrayList<>();
        String sql = "SELECT * FROM roles";

        try (Connection con = ConexionDB.obtenerConexion(); // Llamas al método de tu clase
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Rol rol = new Rol();
                rol.setIdRol(rs.getInt("id_rol"));
                rol.setNombreRol(rs.getString("nombre_rol"));
                lista.add(rol);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar roles: " + e.getMessage());
        }
        return lista;
    }
}