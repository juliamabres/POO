package com.company.practicaparcial1Supermercado;

public class MainSupermercado {
    public static void main(String[] args) {

    Persona persona1 = new Persona("Juan", "Perez", "123", 35);
    RetiroenCaja retiroCaja = new RetiroenCaja(1000, 50, true, persona1,5000., 10, "rapida");

    EnvioDomicilio envioDomicilio1 = new EnvioDomicilio(5000, 10, true, persona1, 25, 12);
        EnvioDomicilio envioDomicilio2 = new EnvioDomicilio(4000, 20, true, persona1, 30, 20);

        System.out.println(retiroCaja);
        System.out.println(retiroCaja.esRapida());
        System.out.println(envioDomicilio1);
        System.out.println(envioDomicilio2);
        System.out.println(envioDomicilio1.compareTo(envioDomicilio2));
    }



}
