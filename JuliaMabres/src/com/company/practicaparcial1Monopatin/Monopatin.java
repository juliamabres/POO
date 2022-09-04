package com.company.practicaparcial1Monopatin;

public class Monopatin {
    private Tecnico tecnico;
    private String fechaInicio;
    private String fechaFinPlanificada;
    private String status;
    private String fechaInicioReal;
    private String fechaFinReal;

    public Monopatin(Tecnico tecnico, String fechaInicio, String fechaFinPlanificada, String status, String fechaInicioReal, String fechaFinReal) {
        this.tecnico = tecnico;
        this.fechaInicio = fechaInicio;
        this.fechaFinPlanificada = fechaFinPlanificada;
        this.status = status;
        this.fechaInicioReal = fechaInicioReal;
        this.fechaFinReal = fechaFinReal;
    }


}
