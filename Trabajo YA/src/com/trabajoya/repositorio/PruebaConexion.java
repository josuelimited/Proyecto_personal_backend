package com.trabajoya.repositorio;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexión...");

        // Intentamos obtener la conexión de tu clase ConexionDB
        Connection instanciaConexion = ConexionDB.obtenerConexion();

        if (instanciaConexion != null) {
            System.out.println("✅ ¡PRUEBA SUPERADA! Java logró entrar a 'Proyecto_personal'.");
            try {
                // Siempre es bueno cerrar la conexión de prueba
                instanciaConexion.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        } else {
            System.out.println("❌ PRUEBA FALLIDA. Revisa los mensajes de error arriba.");
        }
    }
}