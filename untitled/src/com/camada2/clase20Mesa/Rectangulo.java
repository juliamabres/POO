package com.camada2.clase20Mesa;

public class Rectangulo implements Figura{
    private double alto;
    private double largo;

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return alto*largo;
    }
}
