package com.camada2.EjExtraPresupuestos;

public abstract class UnidadDeTrabajo {
    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double calcularMonto();

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion;
    }
}
