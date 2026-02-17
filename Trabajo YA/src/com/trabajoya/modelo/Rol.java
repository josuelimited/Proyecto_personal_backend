package com.trabajoya.modelo;

public class Rol {
    // Atributos basados en tu SQL
    private int idRol;
    private String nombreRol;

    // Constructor vacío (necesario para frameworks y buena práctica)
    public Rol() {
    }

    // Constructor con parámetros
    public Rol(int idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    // Getters y Setters
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}