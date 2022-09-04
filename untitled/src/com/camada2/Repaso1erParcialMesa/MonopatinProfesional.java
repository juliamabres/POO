package com.camada2.Repaso1erParcialMesa;


public class MonopatinProfesional extends Monopatin implements Reparador {


    public MonopatinProfesional(String fechaInicio, String fechaFinalizacion, Tecnico tecnico) {
        super(fechaInicio, fechaFinalizacion, tecnico);
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
