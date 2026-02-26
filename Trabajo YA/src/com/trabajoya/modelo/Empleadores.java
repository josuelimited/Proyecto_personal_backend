package com.trabajoya.modelo;

public class empleadores {
    // Atributos basados en tu SQL (id_empleador, id_usuario, nombre_trabajo, descripcion_trabajo, TELEFONO_trabajo)
    private int idEmpleador;
    private int idUsuario; // Llave foránea que conecta con la tabla usuario
    private String nombreTrabajo;
    private String descripcionTrabajo;
    private String telefonoTrabajo;

    // Constructor vacío
    public empleadores() {
    }

    // Constructor con parámetros
    public empleadores(int idEmpleador, int idUsuario, String nombreTrabajo, String descripcionTrabajo, String telefonoTrabajo) {
        this.idEmpleador = idEmpleador;
        this.idUsuario = idUsuario;
        this.nombreTrabajo = nombreTrabajo;
        this.descripcionTrabajo = descripcionTrabajo;
        this.telefonoTrabajo = telefonoTrabajo;
    }

    // Getters y Setters
    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
}
