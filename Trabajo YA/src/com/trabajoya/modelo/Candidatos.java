package com.trabajoya.modelo;

public class Candidatos {
    // Atributos basados en tu SQL (id_candidato, id_usuario, estado_candidato, habilidades, experiencia, curriculum)
    private int idCandidato;
    private int idUsuario; // Llave foránea que conecta con la tabla usuario
    private boolean estadoCandidato;
    private String habilidades;
    private String experiencia;
    private String curriculum;

    // Constructor vacío
    public Candidatos() {
    }

    // Constructor con parámetros
    public Candidatos(int idCandidato, int idUsuario, boolean estadoCandidato, String habilidades, String experiencia, String curriculum) {
        this.idCandidato = idCandidato;
        this.idUsuario = idUsuario;
        this.estadoCandidato = estadoCandidato;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.curriculum = curriculum;
    }

    // Getters y Setters
    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isEstadoCandidato() {
        return estadoCandidato;
    }

    public void setEstadoCandidato(boolean estadoCandidato) {
        this.estadoCandidato = estadoCandidato;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
}