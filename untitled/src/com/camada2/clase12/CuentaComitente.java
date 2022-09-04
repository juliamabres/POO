package com.camada2.clase12;

public class CuentaComitente extends Cuenta1{
   private String claveCNV;
   private Double comision = 0.01;

    public CuentaComitente(String claveCNV) {
        this.claveCNV = claveCNV;
    }

    @Override
    public void extraer(double monto) {
        if(informarSaldo()*0.5 >= monto)
       setSaldo(informarSaldo()-monto);
    }

    @Override
    public void depositar(double monto) {
        setSaldo((informarSaldo()+monto)-(monto * comision));
    }
}
