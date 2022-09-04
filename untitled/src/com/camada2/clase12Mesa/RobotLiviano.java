package com.camada2.clase12Mesa;

public class RobotLiviano extends SistemaArmas implements Volador, Luchador{
    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Atacar como Robot Liviano");
    }

    @Override
    public void defender() {
        System.out.println("Defender como Robot Liviano");
    }

    @Override
    public void volar() {
        System.out.println("Volar como Robot Liviano");
    }
}
