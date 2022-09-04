package com.camada2.claseRepasoParcial1;

public abstract class SistemaArma1 {
    private Integer energia;

    public SistemaArma1(Integer energia) {
        this.energia = energia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public void mostrar(){
        System.out.println("La energia es de: " + energia);
    };
}
