package com.trabajoya.modelo;

public class permisos {
    // Atributos basados en tu SQL (id_permiso, nombre_permiso, descripcion)
    private int idPermiso;
    private String nombrePermiso;
    private String descripcion;

    // Constructor vacío
    public permisos() {
    }

    // Constructor con parámetros
    public permisos(int idPermiso, String nombrePermiso, String descripcion) {
        this.idPermiso = idPermiso;
        this.nombrePermiso = nombrePermiso;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}