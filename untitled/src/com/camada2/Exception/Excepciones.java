package com.camada2.Exception;

public class Excepciones {
    public static void main(String[] args) {

        int edades [] = {15,12,23,30};
        try{
            System.out.println("La edad de la posicion 4 es: " + edades [4]);
        }
        catch (Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }

        }
}
