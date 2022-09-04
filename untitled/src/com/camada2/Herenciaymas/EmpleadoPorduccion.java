package com.camada2.Herenciaymas;

public class EmpleadoPorduccion extends Empleado{
    private int tiempoExperiencia;

    @Override
    public void trabajar(){
        System.out.println("Empelado de Produccion "+ getNombre()+" trabaja.");
    }

    public EmpleadoPorduccion(String nombre, String apellido, String dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
