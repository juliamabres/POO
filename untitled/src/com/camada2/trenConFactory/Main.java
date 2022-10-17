package com.comada2.trenConFactory;

public class Main {
    public static void main(String[] args) {
        try{
            Figura rueda = FiguraFactory.getInstance().crearFigura("Circulo");
            ((Circulo)rueda).setRadio(1);
            Figura cuerpoVagon = FiguraFactory.getInstance().crearFigura("Rectangulo");
            ((Rectangulo)cuerpoVagon).setAlto(4);
            ((Rectangulo)cuerpoVagon).setLargo(5);
            Figura baseChimenea = FiguraFactory.getInstance().crearFigura("Rectangulo");
            ((Rectangulo)baseChimenea).setAlto(6);
            ((Rectangulo)baseChimenea).setLargo(4);
            Figura cuerpoChimenea= FiguraFactory.getInstance().crearFigura("Rectangulo");
            ((Rectangulo)cuerpoChimenea).setAlto(4);
            ((Rectangulo)cuerpoChimenea).setLargo(3);

            Figura torreChimenea= FiguraFactory.getInstance().crearFigura("Rectangulo");
            ((Rectangulo)torreChimenea).setAlto(1);
            ((Rectangulo)torreChimenea).setLargo(1);

            Figura frenteLocomotora= FiguraFactory.getInstance().crearFigura("Triangulo");
            ((Triangulo)frenteLocomotora).setBase(2);
            ((Triangulo)frenteLocomotora).setAltura(2);

            Figura locomotora= FiguraFactory.getInstance().crearFigura("Figura Compuesta");
            ((FiguraCompuesta)locomotora).agregar(frenteLocomotora);
            ((FiguraCompuesta)locomotora).agregar(rueda);
            ((FiguraCompuesta)locomotora).agregar(rueda);
            ((FiguraCompuesta)locomotora).agregar(baseChimenea);
            ((FiguraCompuesta)locomotora).agregar(cuerpoChimenea);
            ((FiguraCompuesta)locomotora).agregar(torreChimenea);

            System.out.println("Area Locomotora: " + locomotora.calcularArea());

            Figura primerVagon = FiguraFactory.getInstance().crearFigura("Figura Compuesta");

            ((FiguraCompuesta)primerVagon).agregar(rueda);
            ((FiguraCompuesta)primerVagon).agregar(rueda);
            ((FiguraCompuesta)primerVagon).agregar(rueda);
            ((FiguraCompuesta)primerVagon).agregar(cuerpoVagon);

            System.out.println("Area Primer Vagon: " + primerVagon.calcularArea());

            Figura segundoVagon = FiguraFactory.getInstance().crearFigura("Figura Compuesta");
            ((FiguraCompuesta)segundoVagon).agregar(rueda);
            ((FiguraCompuesta)segundoVagon).agregar(rueda);
            ((FiguraCompuesta)segundoVagon).agregar(rueda);
            ((FiguraCompuesta)segundoVagon).agregar(cuerpoVagon);

            System.out.println("Area Segundo Vagon: " + segundoVagon.calcularArea());

            Figura trencito = FiguraFactory.getInstance().crearFigura("Figura Compuesta");
            ((FiguraCompuesta)trencito).agregar(locomotora);
            ((FiguraCompuesta)trencito).agregar(primerVagon);
            ((FiguraCompuesta)trencito).agregar(segundoVagon);

            System.out.println("Area total: " + trencito.calcularArea());

            Figura hexagono = FiguraFactory.getInstance().crearFigura("Hexagono");
            hexagono.calcularArea();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }











    }
}
