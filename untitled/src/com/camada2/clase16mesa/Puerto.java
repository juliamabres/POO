package com.camada2.clase16mesa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
        System.out.println("El contenedor " + contenedor.getNumeroID() + " ha sido incorporado al puerto");
    }

    public void mostrarContenedores(){
        Collections.sort(contenedores);
        for (Contenedor c : contenedores){
                System.out.println(c);
            }
        }

    public int calcularCantContPeligrosoyDesc(){
        int cantidad = 0;
        for (Contenedor c : contenedores){
            if(c.isMarcaMatPeligr() && c.getPais().equals("Desconocida")){
                cantidad ++;
            }
        }
        return cantidad;
    }


}
