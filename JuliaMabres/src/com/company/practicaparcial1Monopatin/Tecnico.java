package com.company.practicaparcial1Monopatin;

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

    @Override
    public String toString() {
        return "----Tecnico----" + "\n" +
                "Nombre= " + nombre + "\n" +
                "Apellido= " + apellido + "\n" +
                "Dni= " + dni + "\n" +
                "Legajo= " + legajo;
    }
}
