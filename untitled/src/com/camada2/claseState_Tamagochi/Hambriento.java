package com.camada2.clase25.tamagotchi;

public class Hambriento implements Estado{
    private Tamagotchi tamagotchi;

    public Hambriento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void bebe() {
        tamagotchi.setEstado(new Triste(tamagotchi));
        System.out.println("Ahora estoy triste");
    }

    @Override
    public void come() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
        System.out.println("Ahora estoy feliz");
    }

    @Override
    public void recibeMimos() {
        System.out.println("sigo hambriento...");
    }
}
