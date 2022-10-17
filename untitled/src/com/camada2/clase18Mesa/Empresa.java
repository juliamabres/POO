package com.camada2.clase18Mesa;

import java.util.ArrayList;

public class Empresa {
        private ArrayList<Reserva> reservas;

    public Empresa() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public double recaudacionTotal(){
        double total = 0;
        for(Reserva reserva : reservas){
            total += reserva.calcularTotalReserva();
        }
        return total;
    }

    public int cantVecesRecorrida(String estacion) throws Exception{
        int cant = 0;

        if(estacion.equals("Buenos Aires")||estacion.equals("Luján")||estacion.equals("Mercedes")||estacion.equals("Suipacha")||estacion.equals("Chivilcoy")||estacion.equals("Alberti")||estacion.equals("Bragado")){
            for(Reserva reserva: reservas)
            {
                if(reserva.getPartida().equals(estacion) || reserva.getDestino().equals(estacion)){
                    cant+=reserva.getCantPasajeros();
                }
            }
        } else {
            throw new Exception("La estacion ingresada es invalida");
        }
        System.out.println(cant);
        return cant;
    }
}
