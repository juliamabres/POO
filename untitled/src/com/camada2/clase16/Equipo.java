package com.camada2.clase16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Equipo {

    private String nombre;
    private List<Jugador> jugadores; //= new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugardor(Jugador jugador){
        jugadores.add(jugador);
        System.out.println("El jugador" + jugador.getNombre() + " ha sido incorporado al equipo");
    }

    public void mostrarJugadoresTitulares(){
        //jugadores.sort(null);
        Collections.sort(jugadores);
        for (Jugador j : jugadores){
            if(j.isTitular()){
                //cuando get es booleando es con IS
                System.out.println(j);
            }
        }
    }
    public int cantidadJugadoresTitLesionados(){
        int cantidad = 0;
        for (Jugador j : jugadores){
            if(j.isLesionado() && j.isTitular()){
                cantidad ++;
            }
        }
        return cantidad;
    }


}
