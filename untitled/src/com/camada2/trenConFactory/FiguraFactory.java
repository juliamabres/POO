package com.comada2.trenConFactory;

public class FiguraFactory{
    private static FiguraFactory instancia;
    private FiguraFactory() {
    }
    public static FiguraFactory getInstance() {
        if (instancia == null)
            instancia = new FiguraFactory();
        return instancia;
    }


    public Figura crearFigura(String tipo) throws RuntimeException{
        switch (tipo) {
            case "Rectangulo":
                return new Rectangulo();
            case "Triangulo":
                return new Triangulo();
            case "Circulo":
                return new Circulo();
            case "Figura Compuesta":
                return new FiguraCompuesta();
            default:
                throw new RuntimeException("Por el momento no estamos construyendo ese tipo de figuras");
        }
    }
}
