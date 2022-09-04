package com.company.practicaparcial1Embarcaciones;

public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;
    private Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public double calculoMontoAlquiler(){
        if(correspondeAdicional()){
            return (precioBase+valorAdicional);
        }
        return precioBase;
    }
    public boolean correspondeAdicional(){
        return anioFabricacion>2020;
    }

    @Override
    public String toString(){
        return
                capitan.toString() + "\n" +
                "Precio Base: " + precioBase + "\n" +
                "Valor Adicional: " + valorAdicional + "\n" +
                "Anio de Fabricacion: " + anioFabricacion+ "\n" +
                "Eslora: " + eslora+ "\n" +
                "Monto Alquiler: "+ calculoMontoAlquiler();
    }

}
