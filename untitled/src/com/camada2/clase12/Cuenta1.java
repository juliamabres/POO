package com.camada2.clase12;

public abstract class Cuenta1 {
    private double saldo;


    public void depositar(double monto) {
        saldo += monto;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double informarSaldo() {
        return saldo;
    }

    public abstract void extraer(double monto);
}
