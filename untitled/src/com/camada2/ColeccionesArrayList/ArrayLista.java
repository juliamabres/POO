package com.camada2.ColeccionesArrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {

    //inicializar array
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabi", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "TodoCode", 2));

    //recorrer por indice (lista se usa size no leghnt). Indicado si necesito un lugar en especial de la lista
        System.out.println("---- FOR ----");
        for(int i=0; i< lista.size(); i++){
            System.out.println("prueba: "+lista.get(i).getNombre());
        }
   // recorrido foreach (recorrido POR CADA)
        System.out.println("---- FOREACH ----");
        for(Persona perso:lista){
            System.out.println("prueba: "+ perso.getNombre());
        }
    }
}
