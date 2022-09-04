package com.camada2.clase12;

public class CuentaCorriente1 extends Cuenta1 implements GravadorDeImpuesto{

    private double descubiertoPermitido;

    public CuentaCorriente1(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido >= monto)
            setSaldo(informarSaldo() - monto);
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double gravar(double porcentaje) {
        double montoImpuesto = informarSaldo()*porcentaje;
        setSaldo(informarSaldo()-montoImpuesto);
        return montoImpuesto;
    }
}
