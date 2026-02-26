package com.trabajoya.modelo;

public class Tipo_de_trabajo {
    // Atributos basados en tu SQL (id_tipo_trabajo, tipo_trabajo)
    private int idTipoTrabajo;
    private String tipoTrabajo;

    // Constructor vacío
    public Tipo_de_trabajo() {
    }

    // Constructor con parámetros
    public Tipo_de_trabajo(int idTipoTrabajo, String tipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
        this.tipoTrabajo = tipoTrabajo;
    }

    // Getters y Setters
    public int getIdTipoTrabajo() {
        return idTipoTrabajo;
    }

    public void setIdTipoTrabajo(int idTipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
}