package com.camada2.clase8;

public class CuentaCorriente extends Cuenta {
    private double descubierto;

    public CuentaCorriente(double saldo, String numero) {
        super(saldo, numero);
        descubierto = 1000.;
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
}
