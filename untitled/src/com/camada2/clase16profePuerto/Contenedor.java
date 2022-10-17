package com.camada2.clase16profePuerto;

public class Contenedor implements Comparable<Contenedor>{

    private int id;
    private String paisOrigen;
    private boolean peligroso;

    public Contenedor(int id, String paisOrigen, boolean peligroso) {
        this.id = id;
        this.paisOrigen = paisOrigen;
        this.peligroso = peligroso;
    }

    public int getId() {
        return id;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }


    public boolean isPeligroso() {
        return peligroso;
    }
    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        //return Integer.compare(id, o.id);
        int resultado =  0;
        if (id > o.id){
            resultado = 1;
        } else if (id < o.id){
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Contenedor numero: " + id + "\n" +
                "Procedencia: " + paisOrigen;
    }
}