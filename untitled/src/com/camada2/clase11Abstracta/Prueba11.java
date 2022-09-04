package com.camada2.clase11Abstracta;

public class Prueba11 {
    public static void main(String[] args) {
        Impresora ie = new ImpresoraEpson("e100", "USB", "23-08-2022", 20, 0.04);

        System.out.println(((ImpresoraEpson)ie).imprimir());

        Impresora ic = new ImpresoraCannon("c100", "USB", "23-08-2022", 20, 0.20);

        System.out.println(((ImpresoraCannon)ic).imprimir());

    }
}
