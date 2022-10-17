package com.camada2.clase20Mesa;

public class Main20Mesa {
    public static void main(String[] args) {

        Figura figu1 = FiguraFactory.getInstancia().crearFigura("rectangulo");
        ((Rectangulo)figu1).setAlto(5.);
        ((Rectangulo)figu1).setLargo(4.);
        Figura figu2 = FiguraFactory.getInstancia().crearFigura("triangulo");
        ((Triangulo)figu2).setAltura(1.);
        ((Triangulo)figu2).setBase(2.);
        Figura figu3 = FiguraFactory.getInstancia().crearFigura("circulo");
        ((Circulo)figu3).setRadio(1);

        System.out.println(figu1.calcularArea());
        System.out.println(figu2.calcularArea());
        System.out.println(figu3.calcularArea());

       //FiguraCompuesta vagon = new FiguraCompuesta();
        //
        //       Rectangulo rect5x4 = new Rectangulo(5., 4.);
        //       Rectangulo rect2x1 = new Rectangulo(2., 1.);
        //       Rectangulo rect3x2 = new Rectangulo(3., 2.);
        //       Circulo circulo1 = new Circulo(1.);
        //       Triangulo triangulo1x2 = new Triangulo(1., 2.);
        //
        //       vagon.getFiguras().add(rect5x4);
        //       vagon.getFiguras().add(circulo1);
        //       vagon.getFiguras().add(circulo1);
        //       vagon.getFiguras().add(circulo1);
        //
        //
        //        System.out.println("---Area de figuras----");
        //        System.out.println(rect5x4.calcularArea());
        //        System.out.println(circulo1.calcularArea());
        //        System.out.println("---Area del vagon----");
        //        System.out.println(vagon.calcularArea());
        //
        //        FiguraCompuesta locomotora = new FiguraCompuesta();
        //        locomotora.getFiguras().add(rect2x1);
        //        locomotora.getFiguras().add(rect3x2);
        //        locomotora.getFiguras().add(rect5x4);
        //        locomotora.getFiguras().add(triangulo1x2);
        //        locomotora.getFiguras().add(circulo1);
        //        locomotora.getFiguras().add(circulo1);
        //
        //        FiguraCompuesta tren = new FiguraCompuesta();
        //        tren.getFiguras().add(vagon);
        //        tren.getFiguras().add(locomotora);
        //
        //        System.out.println("Area locomotora");
        //        System.out.println(locomotora.calcularArea());
        //        System.out.println("Area tren");
        //        System.out.println(tren.calcularArea());

    }
}
