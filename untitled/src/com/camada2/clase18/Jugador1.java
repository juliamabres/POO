package com.camada2.clase18;

public class Jugador1 implements Comparable<Jugador1>{
    private String apellido;
    private String posicion;
    private int numCamiseta;

    public Jugador1(String apellido, String posicion, int numCamiseta) {
        this.apellido = apellido;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    @Override
    public int compareTo(Jugador1 o) {
        return Integer.compare(numCamiseta, o.numCamiseta);
    }
    @Override
    public String toString(){
        return "\n"+"--Jugador--"+ "\n"+
                "Apellido: " + apellido + "\n"+
                "Posicion: " + posicion + "\n"+
                "Numero de Camiseta: " + numCamiseta;
    }

}
