package com.camada2.clase16mesa;

public class Main16Mesa {
    public static void main(String[] args) {
        Contenedor c1 = new Contenedor(90, "Brasil", true);
        Contenedor c2 = new Contenedor(80, "Chile", false);
        Contenedor c3 = new Contenedor(75, "Peru", false);
        Contenedor c4 = new Contenedor(68, "Venezuela", false);
        Contenedor c5 = new Contenedor(25, "Desconocida", true);
        Contenedor c6 = new Contenedor(39, "Desconocida", false);

        Puerto seleccionados = new Puerto("Seleccionados Camada2");
        seleccionados.ingresarContenedor(c1);
        seleccionados.ingresarContenedor(c2);
        seleccionados.ingresarContenedor(c3);
        seleccionados.ingresarContenedor(c4);
        seleccionados.ingresarContenedor(c5);
        seleccionados.ingresarContenedor(c6);

        System.out.println("---Contenedores ORDENADOS en el puerto---");
        seleccionados.mostrarContenedores();
        System.out.println("--Cantidad de contenedores con Materiales Peligrosos y Procedencia Desconocida--");
        System.out.println(seleccionados.calcularCantContPeligrosoyDesc());
    }

}
