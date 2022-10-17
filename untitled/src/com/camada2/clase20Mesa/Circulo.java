package com.camada2.clase20Mesa;

public class Circulo implements Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio, 2)*Math.PI;
        //metodo estatico el pow x eso lo llamo de Math
    }
}
