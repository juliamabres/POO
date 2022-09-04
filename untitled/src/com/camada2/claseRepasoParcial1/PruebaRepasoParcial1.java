package com.camada2.claseRepasoParcial1;

import com.camada2.clase12Mesa.Bombardero;
import com.camada2.clase12Mesa.Tanque;

public class PruebaRepasoParcial1 {
    public static void main(String[] args) {
        // SistemaArma1 sistemaArma = new RobotPesado1(10);
        //PREGUNTAR!!!

        RobotPesado1 robotpesado = new RobotPesado1(10);
        RobotLiviano1 robotliviano = new RobotLiviano1(5);
        Bombardero1 bombardero = new Bombardero1(2);
        Tanque1 tanque = new Tanque1(3);
        Senuelo1 senuelo = new Senuelo1(1);

        robotpesado.volar();
        robotliviano.atacar();
        bombardero.defender();
        tanque.defender();
        senuelo.mostrar();






    }
}
