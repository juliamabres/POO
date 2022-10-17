package com.camada2.PreParcial2;

public class Curso extends OfertaAcademica{
    private double cantHorasMensuales;
    private double meses;
    private double valorHora;

    public double getCantHorasMensuales() {
        return cantHorasMensuales;
    }

    public void setCantHorasMensuales(double cantHorasMensuales) {
        this.cantHorasMensuales = cantHorasMensuales;
    }

    public double getMeses() {
        return meses;
    }

    public void setMeses(double meses) {
        this.meses = meses;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return meses*cantHorasMensuales*valorHora;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Precio: " + calcularPrecio() +"\n"+
                "Duracion: " + meses;
    }
}
