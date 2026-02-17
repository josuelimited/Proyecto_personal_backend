package com.trabajoya.modelo;

import java.util.Date;

public class Usuario {
    private int idUsuario;
    private int idRol;
    private String nombre;
    private String email;
    private String telefono;
    private String password;
    private Date fechaDeRegistro;

    // Constructor vacío (Muy importante para el método login del DAO)
    public Usuario() {
    }

    // Getters y Setters con nombres estándar (CamelCase)
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public int getIdRol() { return idRol; }
    public void setIdRol(int idRol) { this.idRol = idRol; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Date getFechaDeRegistro() { return fechaDeRegistro; }
    public void setFechaDeRegistro(Date fechaDeRegistro) { this.fechaDeRegistro = fechaDeRegistro; }
}