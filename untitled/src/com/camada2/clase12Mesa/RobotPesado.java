package com.camada2.clase12Mesa;

public class RobotPesado extends SistemaArmas implements Volador, Luchador{
    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Atacar como Robot Pesado");
    }

    @Override
    public void defender() {
        System.out.println("Defender como Robot Pesado");
    }

    @Override
    public void volar() {
        System.out.println("Volar como Robot Pesado");
    }
}
