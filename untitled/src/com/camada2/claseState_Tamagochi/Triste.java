package com.camada2.clase25.tamagotchi;

public class Triste implements Estado{

    private Tamagotchi tamagotchi;

    public Triste(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }


    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep..display titilando...");
    }

    @Override
    public void come() {
        System.out.println("Beep, beep...vomitando...");
    }

    @Override
    public void recibeMimos() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
        System.out.println("Ahora estoy feliz");
    }
}
