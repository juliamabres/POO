package com.camada2.PreParcial2;

public class Taller extends OfertaAcademica{
    private int cantTrabajosPracticos;
    private double costoTrabPractico;

    public int getCantTrabajosPracticos() {
        return cantTrabajosPracticos;
    }

    public void setCantTrabajosPracticos(int cantTrabajosPracticos) {
        this.cantTrabajosPracticos = cantTrabajosPracticos;
    }

    public double getCostoTrabPractico() {
        return costoTrabPractico;
    }

    public void setCostoTrabPractico(double costoTrabPractico) {
        this.costoTrabPractico = costoTrabPractico;
    }

    @Override
    public double calcularPrecio() {
        return cantTrabajosPracticos*costoTrabPractico;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Precio: " + calcularPrecio() +"\n"+
                "Cant de TP: " + cantTrabajosPracticos+"\n"+
                "Costo de cada TP: " + costoTrabPractico;
    }
}
