package com.camada2.PreParcial2DOS;

public class MainProp {
    public static void main(String[] args) {

        Casa casa1 = (Casa)PropiedadFactory.getInstancia().crearPropiedad("Casa");
        casa1.setCalle("Av San Martin");
        casa1.setNumero(130);
        casa1.setMontoBase(500);

        Casa casa2 = (Casa)PropiedadFactory.getInstancia().crearPropiedad("Casa");
        casa2.setCalle("Mitre");
        casa2.setNumero(233);
        casa2.setMontoBase(700);

        Barrio barrio1 = (Barrio)PropiedadFactory.getInstancia().crearPropiedad("Barrio");
        barrio1.setCalle("Gutierrez");
        barrio1.setNumero(330);
        barrio1.setFactorMultiplicador(2);
        barrio1.getCasas().add(casa1);
        barrio1.getCasas().add(casa2);

        Municipalidad muni = new Municipalidad("Cordoba");
        muni.getPropiedades().add(casa1);
        muni.getPropiedades().add(casa2);
        muni.getPropiedades().add(barrio1);
        muni.mostrarPropiedades();


    }
}
