package com.camada2.clase11Mesa;

public abstract class Cuenta {

    private double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double monto){
        this.saldo+=monto;
    }

    public abstract void extraer(double monto);

    public double infoSaldo(){
        return saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
