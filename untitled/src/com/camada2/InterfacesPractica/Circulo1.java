package com.camada2.InterfacesPractica;

public class Circulo1 implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo1() {
    }

    public Circulo1(double radio) {
        this.radio = radio;
    }

    // con ALT+ENTER
    @Override
    public double calcularArea1() {
        double pi = 3.14;
        double resultado = pi*radio*radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un ciadrado");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando un circulo");
    }
}

