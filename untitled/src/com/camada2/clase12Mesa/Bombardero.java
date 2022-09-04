package com.camada2.clase12Mesa;

public class Bombardero extends SistemaArmas implements Volador, Luchador{
    public Bombardero(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Atacar como Bombardero");
    }

    @Override
    public void defender() {
        System.out.println("Defender como Bombardero");
    }

    @Override
    public void volar() {
        System.out.println("Volar como Bombardero");
    }
}
