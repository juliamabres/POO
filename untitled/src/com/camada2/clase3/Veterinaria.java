package com.camada2.clase3;

import java.util.Scanner;

public class Veterinaria {
    static void cuantosPaquetes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese cantidad de elemento necesario: ");
        double cantAlimento = scanner.nextDouble();
        scanner.nextLine();

        while(cantAlimento<3){
            System.out.println("Necesita minimo 3 kg de alimento por dia, vuelve a ingresar la cantidad: ");
            cantAlimento = scanner.nextDouble();
        }

        int cantidadPaquetes = 0;
        double kilosTotales = 0;

        while(kilosTotales<cantAlimento){
            System.out.println("Ingrese peso primer paquete: ");
            kilosTotales += scanner.nextDouble();
            scanner.nextLine();
            cantidadPaquetes++;
        }
        System.out.println("Se necesitan " + cantidadPaquetes + " paquetes para alimentar a " + nombre);

    }


    public static void main(String[] args) {
        cuantosPaquetes();
    }

    }
