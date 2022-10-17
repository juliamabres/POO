package com.camada2.clase18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seleccion {

    private String nombre;
    private List<Jugador1> jugadores;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador1 j){
        jugadores.add(j);
        System.out.println("Ha sido incorporado al equipo "+ j.toString());
    }
    public List<Jugador1> obtenerReservas(){
        List<Jugador1> reservas = new ArrayList<>();
        for(Jugador1 j: jugadores){
            if(j.getNumCamiseta()>18){
                reservas.add(j);
            }
        }
        Collections.sort(reservas);
        return reservas;
    }

    public  int cantidadJugadores(String p) throws  Exception{
        int cantidad = 0;
        if(p.equals("ARQUERO")||p.equals("DEFENSOR")||p.equals("MEDIOCAMPISTA")||p.equals("DELANTERO"))
        {
            for(Jugador1 j : jugadores){
                if(j.getPosicion().equals(p)) cantidad++;
            }
        }else {
            throw new Exception("La posicion ingresada no es valida. Error!!!");
        }
        return cantidad;
    }

}
