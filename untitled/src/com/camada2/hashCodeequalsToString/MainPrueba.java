package com.camada2.hashCodeequalsToString;

import java.util.Objects;

class Objeto{
    private String nombre;

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        // return this.nombre;
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(nombre, objeto.nombre);
    }

    @Override
    public int hashCode() {
        final int primo = 31;
        int resultado = 1;
        resultado = primo * resultado + ((nombre == null) ? 0: nombre.hashCode());
        return resultado;
    }
}

public class MainPrueba {
    public static void main(String[] args) {
        Objeto o1 = new Objeto("A");
        Objeto o2 = new Objeto("B");

        //numero que la computadora indentifica a este objeto Objeto@58372a00
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.getNombre()+" y "+o2.getNombre());
        System.out.println("--- toString --- igual que arriba, puedo editar este codigo con @overide");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println("--- equals --- NO PRIMITIVAS, sino ==. Verificar si o1 CONTIENE lo mismo que el o2");
        System.out.println(o1.equals(o2));
        System.out.println("--- PARA PRIMITIVAS, objeto 1 es el objeto 2");
        System.out.println(o1 == o2);
        System.out.println("--- Esto es un hashCode");
        System.out.println(o1.hashCode());




    }
}
