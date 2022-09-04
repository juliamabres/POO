package com.camada2.clase11Mesa;

public class CajaAhorro extends Cuenta{
  private double tasaInteres;

    public CajaAhorro(double saldo, Cliente cliente, double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraer(double monto) {
        if(monto <= infoSaldo())
            setSaldo(infoSaldo()-monto);
    }

    public void cobrarInteres(){

        setSaldo(infoSaldo()*tasaInteres+infoSaldo());
    }
}
