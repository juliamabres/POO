package com.camada2.claseRepasoParcial1;

public class RobotLiviano1 extends SistemaArma1 implements Volador1, Luchador1{


    public RobotLiviano1(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy Robot Liviano y estoy atacando");
    }

    @Override
    public void defender() {
        System.out.println("Soy Robot Liviano y estoy defendiendo");
    }

    @Override
    public void volar() {
        System.out.println("Soy robot liviano y estoy volando");
    }
}
