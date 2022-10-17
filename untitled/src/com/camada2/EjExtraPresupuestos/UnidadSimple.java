package com.camada2.EjExtraPresupuestos;

public class UnidadSimple extends UnidadDeTrabajo{
    private double montoXPersona;
    private int cantPersonas;

    public double getMontoXPersona() {
        return montoXPersona;
    }

    public void setMontoXPersona(double montoXPersona) {
        this.montoXPersona = montoXPersona;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public double calcularMonto() {
        double total = 0;
        if(cantPersonas>10){
            total = montoXPersona*cantPersonas*1.2;
        }
        else{
            total = montoXPersona*cantPersonas;
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Monto de Unidad Simple: "+calcularMonto();
    }
}
