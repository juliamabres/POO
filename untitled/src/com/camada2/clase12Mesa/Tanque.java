package com.camada2.clase12Mesa;

public class Tanque extends SistemaArmas implements Luchador{
    public Tanque(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Atacar como Tanque");
    }

    @Override
    public void defender() {
        System.out.println("Defender como Tanque");
    }
}
