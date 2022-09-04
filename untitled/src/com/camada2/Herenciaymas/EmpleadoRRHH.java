package com.camada2.Herenciaymas;

public class EmpleadoRRHH extends Empleado{
    private int altasLogradas;

    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH "+getNombre()+" trabaja");
    }

    public EmpleadoRRHH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }
}
