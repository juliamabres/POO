package com.camada2.clase19;

public class EmpleadoRelacionDependencia extends Empleado{
    private double sueldoMensual;

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias){
        return (sueldoMensual/30)*dias;
    }
}
