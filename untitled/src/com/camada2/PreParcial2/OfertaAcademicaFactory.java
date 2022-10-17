package com.camada2.PreParcial2;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;
    private OfertaAcademicaFactory(){
    }

    public static OfertaAcademicaFactory getInstancia(){
        if(instancia==null){
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }
    //hasta aca singleton

    //desde aca factory

    public OfertaAcademica crearOfertaAcademica(String tipo)throws Exception{
        switch (tipo){
            case "Curso":
                return new Curso();
            case "Programa Intensivo":
                return new ProgramaIntensivo();
            case "Carrera":
                return new Carrera();
            case "Taller":
                return new Taller();
            default:
                throw new Exception("Se desconoce ese tipo de unidad de trabajo");
        }
    }

}
