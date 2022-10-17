package com.camada2.PreParcial2;

import java.util.List;
import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{

    private  double porcentajeBonificacion;
    private List<OfertaAcademica> ofertaAcademicas = new ArrayList<>();

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
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
        return total-(total*porcentajeBonificacion);
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "Precio: " + calcularPrecio();

    }
}
