package com.trabajoya.modelo;

import java.util.Date;

public class Postulacion {
    // Atributos basados en tu SQL (id_postulacion, id_vacantes, id_candidatos, fecha_postulacion)
    private int idPostulacion;
    private int idVacantes;    // Llave foránea hacia la tabla vacantes
    private int idCandidatos;  // Llave foránea hacia la tabla candidatos
    private Date fechaPostulacion;

    // Constructor vacío
    public Postulacion() {
    }

    // Constructor con parámetros
    public Postulacion(int idPostulacion, int idVacantes, int idCandidatos, Date fechaPostulacion) {
        this.idPostulacion = idPostulacion;
        this.idVacantes = idVacantes;
        this.idCandidatos = idCandidatos;
        this.fechaPostulacion = fechaPostulacion;
    }

    // Getters y Setters
    public int getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(int idPostulacion) {
        this.idPostulacion = idPostulacion;
    }

    public int getIdVacantes() {
        return idVacantes;
    }

    public void setIdVacantes(int idVacantes) {
        this.idVacantes = idVacantes;
    }

    public int getIdCandidatos() {
        return idCandidatos;
    }

    public void setIdCandidatos(int idCandidatos) {
        this.idCandidatos = idCandidatos;
    }

    public Date getFechaPostulacion() {
        return fechaPostulacion;
    }

    public void setFechaPostulacion(Date fechaPostulacion) {
        this.fechaPostulacion = fechaPostulacion;
    }
}