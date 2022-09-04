package com.camada2.clase10Mesa;

public class Prueba9 {
    public static void main(String[] args) {

        Nave nave1 = new Nave(35, 45, 'N', 100.,3);
        Nave nave2 = new Nave(35, 45, 'N', 200.,4);
        Nave nave4 = new Nave(35, 45, 'S', 200.,4);

        System.out.println(nave1);
        System.out.println("-----");
        System.out.println(nave2);
        System.out.println("-----");
        System.out.println(nave4);
        System.out.println(nave1.equals(nave2));
        System.out.println(nave1.equals(nave4));
        nave1.irA(40,50, 'O');
        System.out.println(nave1);

    }
}
