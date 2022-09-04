package com.camada2.ClaseAbstractaDH;

public class Prueba {
    public static void main(String[] args) {

        Animal animal = new Perro("Loli", 2);
        animal.hacerRuido();

        animal = new Gato("Cati", 1);
        animal.hacerRuido();
    }
}
