package com.camada2.ejercicioComprableCombo;

public class MainComprable {
    public static void main(String[] args) {
        Producto pro1 = new Producto("Caja1", 10.);
        Producto pro2 = new Producto("Caja2", 30.);

        pro1.calcularPrecio();
        pro2.calcularPrecio();

    }
}
