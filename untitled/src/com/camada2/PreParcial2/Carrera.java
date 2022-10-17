package com.camada2.PreParcial2;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private double costoBasico;
    private List<OfertaAcademica> ofertaAcademicas = new ArrayList<>();

    public void agregarOfertaAcademica(OfertaAcademica p){
        if(((Curso)p).getCantHorasMensuales()>10)
        ofertaAcademicas.add(p);
        else{
            System.out.println("No se puede agregar el curso por que tiene menos de 10 hs");
        }
    }

    public double getCostoBasico() {

        return costoBasico;
    }

    public void setCostoBasico(double costoBasico) {
        this.costoBasico = costoBasico;
    }

    public List<OfertaAcademica> getOfertaAcademicas() {
        return ofertaAcademicas;
    }

    public void setOfertaAcademicas(List<OfertaAcademica> ofertaAcademicas) {
        this.ofertaAcademicas = ofertaAcademicas;
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for(OfertaAcademica o : ofertaAcademicas){
            total += o.calcularPrecio();
        }
        return total+costoBasico;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Precio: " + calcularPrecio();
    }
}
