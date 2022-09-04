package com.camada2.ClasesAbstractaseIntefaces;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Puño fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }
}
