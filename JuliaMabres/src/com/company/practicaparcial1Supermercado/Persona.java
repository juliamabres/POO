package com.company.practicaparcial1Supermercado;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "----Persona----" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "D.N.I.: " + dni+ "\n" +
                "Edad: "+edad;
    }
}
