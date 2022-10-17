package com.camada2.clase19mesa;

import static java.lang.Math.PI;
public class Pelota extends Producto{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio()
    {
        double volumen = 4./3. * PI * (Math.pow(radio, 3));
        return volumen;
    }

    @Override
    public String toString() {
        return "Pelota:" +
                "radio=" + radio +
                "cm.";
    }
}
