package com.camada2.CompareToDH;

public class Persona1 implements Comparable{

   private int edad;

    public int getEdad() {
        return edad;
    }

    public void decirEdad(){
        System.out.println("La edad es: "+this.edad);
    }

    @Override
    public int compareTo(Object o) {
        Persona1 p = (Persona1) o;
        return this.edad - p.getEdad();
    }
}
