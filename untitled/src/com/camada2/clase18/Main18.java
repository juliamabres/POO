package com.camada2.clase18;


public class Main18 {
    public static void main(String[] args) {
        Jugador1 j1 = new Jugador1("Mesi","DELANTERO", 10);
        Jugador1 j2 = new Jugador1("Lazo","ARQUERO", 12);
        Jugador1 j3 = new Jugador1("Di Maria","DELANTERO", 7);
        Jugador1 j4 = new Jugador1("Dybala","DELANTERO", 17);
        Jugador1 j5 = new Jugador1("Diego","DEFENSOR", 20);

        Seleccion sel = new Seleccion("Argentina");

        sel.agregarJugador(j1);
        sel.agregarJugador(j2);
        sel.agregarJugador(j3);
        sel.agregarJugador(j4);
        sel.agregarJugador(j5);

        System.out.println(sel.obtenerReservas());
        System.out.println("---------------");

        try{
            System.out.println(sel.cantidadJugadores("DELANTERO"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
