package com.trabajoya.modelo;

import java.util.Date;

public class vacantes {
    // Atributos basados en tu SQL
    private int idVacantes;
    private int idEmpleador;
    private int idUbicacionCiudad;
    private int cantPostulacion;
    private int idTipoTrabajo;
    private boolean estadoVacante;
    private String titulo;
    private String descripcion;
    private double salario;
    private String horario;
    private Date fechaPublicacion;
    private Date fechaCierre;

    // Constructor vacío
    public vacantes() {
    }

    // Constructor con parámetros
    public vacantes(int idVacantes, int idEmpleador, int idUbicacionCiudad, int cantPostulacion,
                    int idTipoTrabajo, boolean estadoVacante, String titulo, String descripcion,
                    double salario, String horario, Date fechaPublicacion, Date fechaCierre) {
        this.idVacantes = idVacantes;
        this.idEmpleador = idEmpleador;
        this.idUbicacionCiudad = idUbicacionCiudad;
        this.cantPostulacion = cantPostulacion;
        this.idTipoTrabajo = idTipoTrabajo;
        this.estadoVacante = estadoVacante;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salario = salario;
        this.horario = horario;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaCierre = fechaCierre;
    }

    // Getters y Setters
    public int getIdVacantes() { return idVacantes; }
    public void setIdVacantes(int idVacantes) { this.idVacantes = idVacantes; }

    public int getIdEmpleador() { return idEmpleador; }
    public void setIdEmpleador(int idEmpleador) { this.idEmpleador = idEmpleador; }

    public int getIdUbicacionCiudad() { return idUbicacionCiudad; }
    public void setIdUbicacionCiudad(int idUbicacionCiudad) { this.idUbicacionCiudad = idUbicacionCiudad; }

    public int getCantPostulacion() { return cantPostulacion; }
    public void setCantPostulacion(int cantPostulacion) { this.cantPostulacion = cantPostulacion; }

    public int getIdTipoTrabajo() { return idTipoTrabajo; }
    public void setIdTipoTrabajo(int idTipoTrabajo) { this.idTipoTrabajo = idTipoTrabajo; }

    public boolean isEstadoVacante() { return estadoVacante; }
    public void setEstadoVacante(boolean estadoVacante) { this.estadoVacante = estadoVacante; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public Date getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(Date fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public Date getFechaCierre() { return fechaCierre; }
    public void setFechaCierre(Date fechaCierre) { this.fechaCierre = fechaCierre; }
}