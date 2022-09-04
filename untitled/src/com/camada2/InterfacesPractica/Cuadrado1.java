package com.camada2.InterfacesPractica;


public class Cuadrado1 implements Figura,Dibujable {

    private double lado;

    public Cuadrado1() {
    }

    public Cuadrado1(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea1() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un ciadrado");
    }
}