package com.camada2.Repaso1erParcialMesa;

public class Tecnico {
    private String nombre;
    private String apellido;
    private String dni;
    private String legajo;

    public Tecnico(String nombre, String apellido, String dni, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }

    public Tecnico(String dni, String legajo) {
        this.dni = dni;
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}
