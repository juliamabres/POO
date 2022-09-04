package com.camada2.claseRepasoParcial1;

public class Tanque1 extends SistemaArma1 implements Luchador1{

    public Tanque1(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy tanque y estoy atacando");
    }

    @Override
    public void defender() {
        System.out.println("Soy tanque y estoy defendiendo");
    }
}
