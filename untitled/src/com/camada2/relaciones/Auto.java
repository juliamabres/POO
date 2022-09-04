package com.camada2.relaciones;

public class Auto {
    private int velocidadMaxima;
    private String marca;
    //AGREGACION
    //tele y pantalla

    //COMPOSICION
    public  class Televisor{
        private String marca;
        private Pantalla pantalla;
    // si o si un tele con pantalla
    public  Televisor(){
        pantalla = new Pantalla();
    }
    }

    private class Pantalla{
        private  int pulgadas;
    }



}
