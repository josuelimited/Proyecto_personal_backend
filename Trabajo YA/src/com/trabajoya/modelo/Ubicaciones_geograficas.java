package com.trabajoya.modelo;

public class ubicaciones_geograficas {
    // Atributos basados en tu SQL (id_ubicacion, nombre_ubicacion, tipo_ubicacion)
    private int idUbicacion;
    private String nombreUbicacion;
    private String tipoUbicacion; // Representa el ENUM ('pais', 'departamento', 'ciudad')

    // Constructor vacío
    public ubicaciones_geograficas() {
    }

    // Constructor con parámetros
    public ubicaciones_geograficas(int idUbicacion, String nombreUbicacion, String tipoUbicacion) {
        this.idUbicacion = idUbicacion;
        this.nombreUbicacion = nombreUbicacion;
        this.tipoUbicacion = tipoUbicacion;
    }

    // Getters y Setters
    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

    public String getTipoUbicacion() {
        return tipoUbicacion;
    }

    public void setTipoUbicacion(String tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }
}