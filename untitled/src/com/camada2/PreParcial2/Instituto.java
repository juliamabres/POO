package com.camada2.PreParcial2;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertaAcademicas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertaAcademicas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<OfertaAcademica> getOfertaAcademicas() {
        return ofertaAcademicas;
    }

    public void setOfertaAcademicas(List<OfertaAcademica> ofertaAcademicas) {
        this.ofertaAcademicas = ofertaAcademicas;
    }

    public void generarInforme(){
        System.out.println("Informe de ofertas academicas");
        for(OfertaAcademica o : ofertaAcademicas){
            System.out.println(o.getNombre()+" - Precio: "+o.calcularPrecio()); //no hace falta poner toString
        }
    }
}
