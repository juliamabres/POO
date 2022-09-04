package com.camada2.clase12;

public class Prueba12 {
    public static void main(String[] args) {

        CajaAhorro1 ca = new CajaAhorro1();
        ca.setSaldo(100);
        ca.cobrarIntereses();

        System.out.println(ca.informarSaldo());

        CuentaCorriente1 cc = new CuentaCorriente1(1000);
        cc.setSaldo(800);
        cc.setDescubiertoPermitido(500);
        cc.extraer(1400);
        System.out.println(cc.gravar(0.25));

        System.out.println("Cuenta comitente");
        CuentaComitente ctacomitente = new CuentaComitente("1234");
        ctacomitente.setSaldo(2000);
        ctacomitente.extraer(1500);
        System.out.println(ctacomitente.informarSaldo());
        ctacomitente.depositar(2000);
        System.out.println("--deposito saldo anterior + monto a depositar * 0,99--");
        System.out.println(ctacomitente.informarSaldo());

    }
}
