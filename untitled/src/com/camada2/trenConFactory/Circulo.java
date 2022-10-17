package com.comada2.trenConFactory;

public class Circulo implements Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        //PI*radio^2
        return Math.round((Math.PI*Math.pow(radio, 2))*100.)/100.;
    }


}