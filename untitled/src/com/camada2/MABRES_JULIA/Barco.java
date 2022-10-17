package com.camada2.MABRES_JULIA;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> cargas;

    public Barco(String nombre) {
        this.nombre = nombre;
        cargas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }
    public void mostrarCargas(){
        System.out.println("----Cargas del Barco----");
        for (Carga c : cargas){
            System.out.println("Nombre: " + c.getNombre() + "\n"
                    +"El peso es de: " + c.pesoCarga() + "\n------");
        }
    }
}
