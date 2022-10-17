package com.camada2.clase19;

public class EmpleadoFactory {
    //Singleton
    private static EmpleadoFactory instancia;

    private EmpleadoFactory(){
    }

    public static EmpleadoFactory getInstancia(){
        if(instancia==null)
            instancia = new EmpleadoFactory();
        return instancia;
    }

    //Factory
    public Empleado construirEmpleado(String tipo) throws RuntimeException{
        switch (tipo) {
            case "EMP-RD":
                EmpleadoRelacionDependencia empRd = new EmpleadoRelacionDependencia();
                empRd.setSueldoMensual(1000.);
                return empRd;
            case "EMP-PH":
                EmpleadoContratado empC = new EmpleadoContratado();
                empC.setRetencionImpuesto(0.14);
                empC.setValorHora(7.);
                return empC;
            default:
                throw new RuntimeException("No se encontro el tipo de empleado a consrtuir");
        }
    }
}
