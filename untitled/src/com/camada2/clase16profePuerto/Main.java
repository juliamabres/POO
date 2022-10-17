package com.camada2.clase16profePuerto;

public class Main {
    public static void main(String[] args) {
        Contenedor cont1 = new Contenedor(1, "China", true);
        Contenedor cont2 = new Contenedor(2, "China", true);
        Contenedor cont3 = new Contenedor(3, "Argentina", false);
        Contenedor cont4 = new Contenedor(4, "Rusia", false);
        Contenedor cont5 = new Contenedor(5, "Desconocida", false);
        Contenedor cont6 = new Contenedor(6, "Desconocida", true);
        Contenedor cont7 = new Contenedor(7, "Desconocida", true);
        Contenedor cont8 = new Contenedor(8, "Desconocida", true);

        Puerto puer = new Puerto();
        puer.agregarContenedor(cont1);
        puer.agregarContenedor(cont2);
        puer.agregarContenedor(cont3);
        puer.agregarContenedor(cont4);
        puer.agregarContenedor(cont5);
        puer.agregarContenedor(cont6);
        puer.agregarContenedor(cont7);
        puer.agregarContenedor(cont8);
        System.out.println("---Comun---");
        puer.mostrarContenedores();
        System.out.println("Cantidad de contenedores peligrosos: " + puer.cantPeligrosos());
        System.out.println("---Stream---");
        puer.mostrarCont();
        System.out.println("Cantidad de contenedores peligrosos: " + puer.peligrosos());

    }
}
