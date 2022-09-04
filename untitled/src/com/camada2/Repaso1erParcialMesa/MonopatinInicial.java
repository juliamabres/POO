package com.camada2.Repaso1erParcialMesa;

public class MonopatinInicial extends Monopatin implements Reparador {


    public MonopatinInicial(String fechaInicio, String fechaIFinalizacion, Tecnico tecnico) {
        super(fechaInicio, fechaIFinalizacion, tecnico);
    }


    @Override
    public String estado() {
        return null;
    }

    @Override
    public Boolean reparacionenFecha() {
        return null;
    }
    @Override
    public void reparar() {

    }

    @Override
    public Integer asignarNumReparac() {
        return null;
    }

    @Override
    public String descripcion(String texto) {
        return null;
    }

    @Override
    public String asignacFechaIReal() {
        return null;
    }

    @Override
    public String asignacFechaFReal() {
        return null;
    }
}
