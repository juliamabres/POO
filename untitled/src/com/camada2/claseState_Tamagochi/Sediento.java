package com.camada2.clase25.tamagotchi;

public class Sediento implements Estado{
    private Tamagotchi tamagotchi;

    public Sediento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void bebe() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
        System.out.println("Ahora estoy feliz");
    }

    @Override
    public void come() {
        tamagotchi.setEstado(new Triste(tamagotchi));
        System.out.println("Ahora estoy triste");
    }

    @Override
    public void recibeMimos() {
        System.out.println("sigo sediento...");
    }
}
