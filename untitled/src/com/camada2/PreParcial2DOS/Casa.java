package com.camada2.PreParcial2DOS;

public class Casa extends Propiedad{
    private double montoBase;

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = montoBase;
        if(getCalle().equals("Av San Martin")){
            impuesto *= 1.1;
        }
        return impuesto;
    }
}
