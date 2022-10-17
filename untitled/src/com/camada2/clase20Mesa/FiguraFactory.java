package com.camada2.clase20Mesa;

public class FiguraFactory {
    private static FiguraFactory instancia;
    private FiguraFactory(){
    }

    public static FiguraFactory getInstancia(){
        if(instancia==null)
            instancia = new FiguraFactory();
        return instancia;
    }

    //Factory
    public Figura crearFigura(String tipo) throws RuntimeException{
        switch (tipo) {
            case "rectangulo":
                Rectangulo rect = new Rectangulo();
                return rect;
            case "circulo":
                Circulo circ = new Circulo();
                return circ;
            case "triangulo":
                Triangulo tri = new Triangulo();
                return tri;
            default:
                throw new RuntimeException("No se encontro el tipo de producto");
        }
    }
}


//switch (tipo) {
//            case "rectangulo5x4":
//                Rectangulo rect5x4 = new Rectangulo(5.,4.);
//                return rect5x4;
//            case "circulo1":
//                Circulo circ1 = new Circulo(1.);
//                return circ1;
//            default:
//                throw new RuntimeException("No se encontro el tipo de producto");