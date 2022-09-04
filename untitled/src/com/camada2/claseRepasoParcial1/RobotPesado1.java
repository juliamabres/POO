package com.camada2.claseRepasoParcial1;

public class RobotPesado1 extends SistemaArma1 implements Volador1, Luchador1 {


    public RobotPesado1(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy Robot Pesado y estoy atacando");
    }

    @Override
    public void defender() {
        System.out.println("Soy robot pesado y estoy defendiendo");

    }

    @Override
    public void volar() {
        System.out.println("Soy robot pesado y estoy volando");
    }
}
