package com.camada2.clase10;

public class Prueba2 {
    public static void main(String[] args) {

        SocioPileta socio1 = new SocioPileta("555", "Jorgito",
                1500., "Natacion", 500., true);
        SocioPileta socio2 = new SocioPileta("444", "Julia",
                1200., "Natacion", 600., false);

        System.out.println(socio1);
        System.out.println("--------");
        System.out.println(socio2);
        System.out.println("--------");
        System.out.println(socio1.equals(socio2));
    }
}
