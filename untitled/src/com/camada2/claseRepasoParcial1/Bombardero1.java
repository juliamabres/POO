package com.camada2.claseRepasoParcial1;

public class Bombardero1 extends SistemaArma1 implements Volador1, Luchador1{
    public Bombardero1(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy Bombardero y estoy atacando");
    }

    @Override
    public void defender() {
        System.out.println("Soy Bombardero y estoy defendiendo");
    }

    @Override
    public void volar() {
        System.out.println("Soy Bombardero y estoy volando");
    }
}
