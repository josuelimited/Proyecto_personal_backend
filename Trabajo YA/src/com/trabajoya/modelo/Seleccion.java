package com.trabajoya.modelo;

public class Seleccion {
    // Atributos basados en tu SQL (id_seleccion, id_empleador, id_postulacion)
    private int idSeleccion;
    private int idEmpleador;   // Llave foránea hacia la tabla empleadores
    private int idPostulacion; // Llave foránea hacia la tabla postulacion

    // Constructor vacío
    public Seleccion() {
    }

    // Constructor con parámetros
    public Seleccion(int idSeleccion, int idEmpleador, int idPostulacion) {
        this.idSeleccion = idSeleccion;
        this.idEmpleador = idEmpleador;
        this.idPostulacion = idPostulacion;
    }

    // Getters y Setters
    public int getIdSeleccion() {
        return idSeleccion;
    }

    public void setIdSeleccion(int idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public int getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(int idPostulacion) {
        this.idPostulacion = idPostulacion;
    }
}