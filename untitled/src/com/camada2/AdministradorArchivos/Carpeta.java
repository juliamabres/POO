package com.camada2.AdministradorArchivos;

import java.util.List;
import java.util.ArrayList;

public class Carpeta extends Archivo{

    private List<Archivo> listaArchivos = new ArrayList<Archivo>();

    public void agregarArchivo(Archivo a){
               listaArchivos.add(a);
        System.out.println("Se agregado con exito el archivo: "+a.getNombre());
    }

    public void eliminarArchivo (Archivo a) {
        listaArchivos.remove(a);
        System.out.println("Se ha eliminado con exito el archivo: "+a.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Los archivos son: " + listaArchivos;
    }
}
