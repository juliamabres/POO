package com.company.Parcial1;

public class Policia {
    private String nombre;
    private String apellido;
    private String legajo;

    public Policia(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    @Override
    public String toString(){
        return "----Policia----" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Legajo: " + legajo;
    }
}
