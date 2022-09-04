package com.camada2.clase12Mesa;

public abstract class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    public Integer getEnergia() {
        return energia;
    }


    public void mostrar(){
        System.out.println("Energía disponible: " + energia);
    }
}
