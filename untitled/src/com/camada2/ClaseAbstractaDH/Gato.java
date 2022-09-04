package com.camada2.ClaseAbstractaDH;

public class Gato extends Animal{

    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }
    //poner hacerRuido+enter y crea
    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
