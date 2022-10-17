package com.camada2.clase16;

public class Main16 {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Mesi",10, false, true);
        Jugador j2 = new Jugador("Lazo",8, false, true);
        Jugador j3 = new Jugador("Di Maria",12, false, true);
        Jugador j4 = new Jugador("Dybala",21, false, true);
        Jugador j5 = new Jugador("Diego",15, true, true);
        Jugador j6 = new Jugador("Zanetti",18, false, true);

        Equipo seleccion = new Equipo("Camada 2 FC");
        seleccion.agregarJugardor(j1);
        seleccion.agregarJugardor(j2);
        seleccion.agregarJugardor(j3);
        seleccion.agregarJugardor(j4);
        seleccion.agregarJugardor(j5);
        seleccion.agregarJugardor(j6);

        System.out.println("--Titulares--");
        seleccion.mostrarJugadoresTitulares();
        System.out.println("--Lesionados--");
        System.out.println(seleccion.cantidadJugadoresTitLesionados());

    }
}
