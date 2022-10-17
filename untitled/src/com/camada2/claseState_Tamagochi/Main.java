package com.camada2.clase25.tamagotchi;

public class Main {
    public static void main(String[] args) {
        Tamagotchi t = new Tamagotchi();
        t.bebe();//siguio triste
        t.recibeMimos();//paso a feliz
        t.come();//paso a sediento
        t.bebe();//paso a feliz
        t.recibeMimos();//siguio feliz
    }
}
