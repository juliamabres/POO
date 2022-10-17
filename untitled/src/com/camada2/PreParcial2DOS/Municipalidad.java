package com.camada2.PreParcial2DOS;

import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private String nombre;
    private List<Propiedad> propiedades;

    public Municipalidad(String nombre) {
        this.nombre = nombre;
        propiedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public void mostrarPropiedades(){
        System.out.println("----Propiedades del Municipio----");
        for (Propiedad p : propiedades){
            System.out.println("Direccion: " + p.getCalle() + " " + p.getNumero() + "\nImpuestos a pagar: $" + p.calcularImpuesto() + "\n---------------");
        }
    }
}
