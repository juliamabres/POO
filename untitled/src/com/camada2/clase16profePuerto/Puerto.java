package com.camada2.clase16profePuerto;

import java.util.ArrayList;

public class Puerto {

    private ArrayList<Contenedor> listaContenedores;

    public Puerto() {
        this.listaContenedores = new ArrayList<Contenedor>();
    }


    public void agregarContenedor(Contenedor cont) {
        listaContenedores.add(cont);
    }


    public void mostrarContenedores() {
        listaContenedores.sort(null);
        for (Contenedor cont : listaContenedores) {
            System.out.println(cont.toString());
        }
    }

    public int cantPeligrosos() {
        int cantidad = 0;
        for (Contenedor cont : listaContenedores) {
            if (cont.getPaisOrigen().equals("Desconocida") && cont.isPeligroso()) {
                cantidad++;
            }
        }
        return cantidad;
    }

    //hecho con Streams, pueden investigar de que se trata NO ES ALGO QUE VAYAMOS A EVALUAR EN ESTE CURSO
    public void mostrarCont() {
        listaContenedores
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
    public int peligrosos() {
            return (int) listaContenedores.stream().filter(Contenedor::isPeligroso).filter((c) -> c.getPaisOrigen().equals("Desconocida")).mapToLong(e -> 1L).sum();
        }
    }
