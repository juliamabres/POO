package com.camada2.clase18Mesa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reserva {
    private String codigo;
    private int cantPasajeros;
    private String partida;
    private String destino;
    private List<String> estacionesHabilitadas;

    public Reserva(String codigo, int cantPasajeros, String partida, String destino) {
        this.codigo = codigo;
        this.cantPasajeros = cantPasajeros;
        this.partida = partida;
        this.destino = destino;
        estacionesHabilitadas = new ArrayList<>(Arrays.asList("Buenos Aires", "Luján", "Mercedes", "Suipacha", "Chivilcoy", "Alberti", "Bragado"));

    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public String getPartida() {
        return partida;
    }

    public String getDestino() {
        return destino;
    }

    public Double calcularTotalReserva(){
        int indiceEstacionOrigen = 0;
        int indiceEstacionDestino = 0;

        for(String e : estacionesHabilitadas){
            if(e.equals(partida)){
                indiceEstacionOrigen = (estacionesHabilitadas.indexOf(e)==0) ? (estacionesHabilitadas.indexOf(e)+ 1) : (estacionesHabilitadas.indexOf(e));
            }
            if (e.equals(destino)){
                indiceEstacionDestino = (estacionesHabilitadas.indexOf(e)==0) ? (estacionesHabilitadas.indexOf(e)+ 1) : (estacionesHabilitadas.indexOf(e));
            }
        }

        //teniendo en cuenta que el origen puede ser desde Bragado hacia Bs As
        int cantidadEstaciones = (indiceEstacionDestino - indiceEstacionOrigen) > 0 ? ((indiceEstacionDestino - indiceEstacionOrigen)) + 2 : ((indiceEstacionDestino - indiceEstacionOrigen)*-1) + 2;


        Double precio = 50. * cantidadEstaciones * cantPasajeros;

        if(fueCompleto())
            precio = precio * 0.8;

        return precio;
    }

    public boolean fueCompleto(){
  return ((partida.equals("Buenos Aires") && destino.equals("Bragado"))||(partida.equals("Bragado") && destino.equals("Buenos Aires")));
    }

}

