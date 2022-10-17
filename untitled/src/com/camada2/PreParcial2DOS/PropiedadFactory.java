package com.camada2.PreParcial2DOS;

public class PropiedadFactory {
    private static PropiedadFactory instancia;

    private PropiedadFactory() {
    }

    public static PropiedadFactory getInstancia() {
        if (instancia == null) {
            instancia = new PropiedadFactory();
        }
        return instancia;
    }

    public Propiedad crearPropiedad(String tipo) throws RuntimeException{
        switch (tipo){
            case "Casa":
                return new Casa();
            case "Barrio":
                return new Barrio();
            default:
                throw new RuntimeException("Se desconoce ese tipo de unidad de trabajo");
        }
    }
}