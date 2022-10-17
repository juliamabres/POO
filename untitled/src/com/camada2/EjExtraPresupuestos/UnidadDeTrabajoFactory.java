package com.camada2.EjExtraPresupuestos;

public class UnidadDeTrabajoFactory {
    private static UnidadDeTrabajoFactory instancia;

    private UnidadDeTrabajoFactory(){
    }

    public static UnidadDeTrabajoFactory getInstance(){
        if (instancia == null)
            instancia = new UnidadDeTrabajoFactory();
        return instancia;
    }

    public UnidadDeTrabajo crearUnidad(String tipo) throws Exception{
        //Si pongo RuntimeExeption no va con try y catch
        switch (tipo){
            case "Unidad Simple":
                return new UnidadSimple();
            case "Unidad Combinada":
                return new UnidadCombinada();
            default:
                throw new Exception("El dato de tipo de unidad es incorrecto");
        }

    }

}
