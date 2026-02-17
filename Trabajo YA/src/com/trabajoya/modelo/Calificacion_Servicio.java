package com.trabajoya.modelo;

import java.util.Date;

public class Calificacion_Servicio {
    // Atributos basados en tu SQL (id_calificacion, id_vacantes, id_usuario, puntuacion, comentario, fecha_calificacion)
    private int idCalificacion;
    private int idVacantes;   // Vacante calificada
    private int idUsuario;    // Usuario que califica
    private int puntuacion;   // Debe estar entre 1 y 5
    private String comentario;
    private Date fechaCalificacion;

    // Constructor vacío
    public Calificacion_Servicio() {
    }

    // Constructor con parámetros
    public Calificacion_Servicio(int idCalificacion, int idVacantes, int idUsuario, int puntuacion, String comentario, Date fechaCalificacion) {
        this.idCalificacion = idCalificacion;
        this.idVacantes = idVacantes;
        this.idUsuario = idUsuario;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fechaCalificacion = fechaCalificacion;
    }

    // Getters y Setters
    public int getIdCalificacion() { return idCalificacion; }
    public void setIdCalificacion(int idCalificacion) { this.idCalificacion = idCalificacion; }

    public int getIdVacantes() { return idVacantes; }
    public void setIdVacantes(int idVacantes) { this.idVacantes = idVacantes; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public int getPuntuacion() { return puntuacion; }
    public void setPuntuacion(int puntuacion) { this.puntuacion = puntuacion; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public Date getFechaCalificacion() { return fechaCalificacion; }
    public void setFechaCalificacion(Date fechaCalificacion) { this.fechaCalificacion = fechaCalificacion; }
}