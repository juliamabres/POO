package com.camada2.MABRES_JULIA;

public class CargaFactory {
    private static CargaFactory instancia;

    private CargaFactory() {
    }

    public static CargaFactory getInstancia() {
        if (instancia == null) {
            instancia = new CargaFactory();
        }
        return instancia;
    }
    public Carga crearCarga(String tipo) throws RuntimeException{
        switch (tipo){
            case "Simple":
                return new Simple();
            case "Contenedor":
                return new Contenedor();
            default:
                throw new RuntimeException("Se desconoce ese tipo de carga ingresado");
        }
    }
}
