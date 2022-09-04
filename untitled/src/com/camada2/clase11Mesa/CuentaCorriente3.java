package com.camada2.clase11Mesa;

public class CuentaCorriente3 extends Cuenta{
    private double descubierto;

    public CuentaCorriente3(double saldo, Cliente cliente, double descubierto) {
        super(saldo, cliente);
        this.descubierto = descubierto;
    }

    @Override
    public void extraer(double monto) {
        if(infoSaldo() + descubierto >= monto)
            setSaldo(infoSaldo() - monto);
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
