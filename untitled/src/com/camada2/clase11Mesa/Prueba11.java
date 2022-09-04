package com.camada2.clase11Mesa;

import com.camada2.clase8.CuentaCorriente;

public class Prueba11 {
    public static void main(String[] args) {

        Cliente julia = new Cliente("1234", "Mabres", "33501137", "20335011371");

        CajaAhorro ca = new CajaAhorro(1000., julia, 0.15);
        ca.infoSaldo();
        ca.cobrarInteres();
        ca.extraer(1000.);
        CuentaCorriente3 cc = new CuentaCorriente3(1000.,julia, 2000.);
        cc.extraer(500.);

        System.out.println(ca.infoSaldo());
        System.out.println(cc.infoSaldo());
    }
}
