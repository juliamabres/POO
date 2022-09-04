package com.camada2.InterfaceHashToSComT;

import com.camada2.clase10.Socio;

public class Mujer extends Persona9{

    private Integer edad;
    private Integer cantHijos;

    public Mujer(String nombre, Integer felicidad, Integer cantidadAmigos, Integer edad, Integer cantHijos) {
        super(nombre, felicidad, cantidadAmigos);
        this.edad = edad;
        this.cantHijos = cantHijos;
    }

    @Override
    public void hacerAmigo() {
        super.hacerAmigo();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * edad.hashCode();
        hash = hash * cantHijos.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Socio)) return false;
        else {
         Mujer mujerAuxiliar = (Mujer) o;
         return getNombre().equals(mujerAuxiliar.getNombre()) && edad.equals(mujerAuxiliar.edad);
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Cantidad de Hijos: " + cantHijos + "\n" +
                "Nivel de felicidad: " + getFelicidad() + "\n" +
                "Cantidad de amigos: " + getCantidadAmigos();
    }
}
