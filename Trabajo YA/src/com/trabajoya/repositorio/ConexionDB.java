package com.trabajoya.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    // URL con el nombre exacto de la base de datos que vimos en tu foto
    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_personal";
    private static final String USUARIO = "root";
    private static final String CLAVE = "#Aprendiz2024"; // Lo dejamos vacío porque entra sin contraseña

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Esto le dice a Java: "Usa el driver que descargamos"
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println(" ¡Conexión exitosa a Proyecto_personal!");
        } catch (ClassNotFoundException e) {
            System.out.println(" Error: No se encontró el driver .jar");
        } catch (SQLException e) {
            System.out.println(" Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}