package com.camada2.clase20;

public class Mainclase20 {
    public static void main(String[] args) {
//carrito
        Carrito carrito1 = new Carrito(1);

        //combo
        Combo c1 = new Combo("Camada2", 0., 0.20);
        c1.agregarProducto(new ProductoIndividual("Pizza", 100.));
        System.out.println(c1.getPrecio());
    }
}
