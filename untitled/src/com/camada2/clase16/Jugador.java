package com.camada2.clase16;

public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private int numCamiseta;
    private boolean lesionado;
    private boolean titular;

    public Jugador(String nombre, int numCamiseta, boolean lesionado, boolean titular) {
        this.nombre = nombre;
        this.numCamiseta = numCamiseta;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    @Override
    public int compareTo(Jugador o) {

        return Integer.compare(numCamiseta, o.numCamiseta);
    }

    @Override
    public String toString(){
        String lesionado = this.lesionado ? "Si" : "No";
        String titular = this.titular ? "Si" : "No";
        return "Jugador: " + nombre + "\n"+
                "Numero de camiseta: " + numCamiseta + "\n"+
                "Lesionado: " + lesionado + "\n"+
                "Titular: "+ titular;
    }

}
