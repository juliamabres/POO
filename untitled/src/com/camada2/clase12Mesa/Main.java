package com.camada2.clase12Mesa;

public class Main {
    public static void main(String[] args) {
        RobotLiviano robotLiviano = new RobotLiviano(50);
        RobotPesado robotPesado = new RobotPesado(100);
        Bombardero bombardero = new Bombardero(250);
        Tanque tanque = new Tanque(200);
        Seniuelo seniuelo = new Seniuelo(10);

        System.out.println("------Robot Liviano------");
        robotLiviano.mostrar();
        robotLiviano.atacar();
        robotLiviano.defender();
        robotLiviano.volar();
        System.out.println("------Robot Pesado------");
        robotPesado.mostrar();
        robotPesado.atacar();
        robotPesado.defender();
        robotPesado.volar();
        System.out.println("------Bombardero------");
        bombardero.mostrar();
        bombardero.atacar();
        bombardero.defender();
        bombardero.volar();
        System.out.println("------Tanque------");
        tanque.mostrar();
        tanque.atacar();
        tanque.defender();
        System.out.println("------Señuelo------");
        seniuelo.mostrar();

    }
}
