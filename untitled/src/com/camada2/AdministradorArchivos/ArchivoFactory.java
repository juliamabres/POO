package com.camada2.AdministradorArchivos;

public class ArchivoFactory {

    private static ArchivoFactory instancia;

    private ArchivoFactory(){
    }
    public static ArchivoFactory getInstance() {
        if (instancia == null)
            instancia = new ArchivoFactory();
        return instancia;
    }
    public Archivo crearArchivo(String tipo) throws Exception{
        switch (tipo){
            case "Archivo Concreto":
                return new ArchivoConcreto();
            case "Archivo Carpeta":
                return new Carpeta();
            default:
                throw new Exception("Por el momento no estamos creando ese tipo de archivo");
        }
    }

}
