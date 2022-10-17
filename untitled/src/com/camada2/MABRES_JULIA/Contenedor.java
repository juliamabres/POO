package com.camada2.MABRES_JULIA;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{

    private double pesoContenedor;
    private List<Carga> cargas = new ArrayList<>();

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }
    public void agregarCarga(Carga carga){
        cargas.add(carga);
        System.out.println("La carga "+carga.getNombre()+" ha sido agregada con exito");
    }
    @Override
    public double pesoCarga() {
        double total = 0;
        for(Carga c: cargas){
            total += c.pesoCarga();
        }
        return total+pesoContenedor;
    }
    }

