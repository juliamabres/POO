package com.camada2.clase18mesaprofe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reserva {
    private String codigo;
    private int cantViajeros;
    private String estacionOrigen;
    private String estacionDestino;

    private List<String> estacionesHabilitadas = new ArrayList<>(Arrays.asList("Buenos Aires", "Luján", "Mercedes", "Suipacha", "Chivilcoy", "Alberti", "Bragado"));



    public Reserva(String codigo, int cantViajeros, String estacionOrigen, String estacionDestino) {
        this.codigo = codigo;
        this.cantViajeros = cantViajeros;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
    }

    public int getCantViajeros() {
        return cantViajeros;
    }


    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public List<String> getEstacionesHabilitadas() {
        return estacionesHabilitadas;
    }

    //en el futuro se prevee que puedan habilitarse más, por eso no declaramos el atributo como final
    public void setEstacionesHabilitadas(List<String> estacionesHabilitadas) {
        this.estacionesHabilitadas = estacionesHabilitadas;
    }

    //Métodos
    public Double calcularTotalReserva(){
        int indiceEstacionOrigen = 0;
        int indiceEstacionDestino = 0;

        for(String e : estacionesHabilitadas){
            if(e.equals(estacionOrigen)){
                indiceEstacionOrigen = (estacionesHabilitadas.indexOf(e)==0) ? (estacionesHabilitadas.indexOf(e)+ 1) : (estacionesHabilitadas.indexOf(e));
            }
            if (e.equals(estacionDestino)){
                indiceEstacionDestino = (estacionesHabilitadas.indexOf(e)==0) ? (estacionesHabilitadas.indexOf(e)+ 1) : (estacionesHabilitadas.indexOf(e));
            }
        }

        //teniendo en cuenta que el origen puede ser desde Bragado hacia Bs As
        int cantidadEstaciones = (indiceEstacionDestino - indiceEstacionOrigen) > 0 ? ((indiceEstacionDestino - indiceEstacionOrigen)) + 2 : ((indiceEstacionDestino - indiceEstacionOrigen)*-1) + 2;


        Double precio = 50. * cantidadEstaciones * cantViajeros;

        if(fueCompleto())
            precio = precio * 0.8;

        return precio;
    }

    private boolean fueCompleto(){
        return (estacionOrigen.equals("Buenos Aires") && estacionDestino.equals("Bragado")) || (estacionOrigen.equals("Bragado") && estacionDestino.equals("Buenos Aires"));
    }
}
