package com.comada2.trenConFactory;

public class Triangulo implements Figura{
    private double base;
    private double altura;


    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    @Override
    public double calcularArea() {
        return
                Math.round(((base * altura) /2)*100.0)/100.0;
    }
}