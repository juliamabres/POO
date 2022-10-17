package com.camada2.clase25.tamagotchi;

public class Feliz implements Estado{
    private Tamagotchi tamagotchi;

    public Feliz(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void bebe() {
        tamagotchi.setEstado(new Hambriento(tamagotchi));
        System.out.println("Tengo hambre");
    }

    @Override
    public void come() {
        tamagotchi.setEstado(new Sediento(tamagotchi));
        System.out.println("Tengo sed");
    }

    @Override
    public void recibeMimos() {
        System.out.println("sigo feliz...");
    }
}
