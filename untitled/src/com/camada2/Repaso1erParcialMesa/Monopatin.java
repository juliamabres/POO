package com.camada2.Repaso1erParcialMesa;

public abstract class Monopatin {
    private String fechaInicio;
    private String fechaFinalizacion;
    private Tecnico tecnico;

    public Monopatin(String fechaInicio, String fechaFinalizacion, Tecnico tecnico) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.tecnico = tecnico;
    }

    public abstract String estado();

    public abstract Boolean reparacionenFecha();

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
