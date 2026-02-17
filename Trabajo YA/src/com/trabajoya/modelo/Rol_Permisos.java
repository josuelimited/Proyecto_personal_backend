package com.trabajoya.modelo;

public class Rol_Permisos {
    // Atributos basados en tu SQL (id_rol_permiso, id_rol, id_permiso)
    private int idRolPermiso;
    private int idRol;      // Llave foránea hacia la tabla roles
    private int idPermiso;  // Llave foránea hacia la tabla permisos

    // Constructor vacío
    public Rol_Permisos() {
    }

    // Constructor con parámetros
    public Rol_Permisos(int idRolPermiso, int idRol, int idPermiso) {
        this.idRolPermiso = idRolPermiso;
        this.idRol = idRol;
        this.idPermiso = idPermiso;
    }

    // Getters y Setters
    public int getIdRolPermiso() {
        return idRolPermiso;
    }

    public void setIdRolPermiso(int idRolPermiso) {
        this.idRolPermiso = idRolPermiso;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }
}