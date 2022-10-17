package com.camada2.clase18mesaprofe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Empresa {

    private ArrayList<Reserva> reservas;


    public Empresa(){
        reservas = new ArrayList<>();
    }


    //Métodos
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

    //Recaudacion streams
    public double recaudacion(){

        return (double) reservas.stream().mapToDouble(Reserva::calcularTotalReserva).sum();
    }

    //Recibe una estación por
    //parámetro y retorna cuántas personas pasarán por esa estación, de acuerdo a las
    //reservas existentes (si subieron o bajaron en esa estación).
    public int cantVecesRecorrida(String estacion) throws Exception{
        int cant = 0;

        if(estacion.equals("Buenos Aires")||estacion.equals("Luján")||estacion.equals("Mercedes")||estacion.equals("Suipacha")||estacion.equals("Chivilcoy")||estacion.equals("Alberti")||estacion.equals("Bragado")){
            for(Reserva reserva: reservas)
            {
                if(reserva.getEstacionDestino().equals(estacion) || reserva.getEstacionOrigen().equals(estacion)){
                    cant+=reserva.getCantViajeros();
                }
            }
        } else {
            throw new Exception("La estación ingresada es invalida");
        }
        System.out.println(cant);
        return cant;
    }

    public int cantVeces(String estacion) throws Exception{
        int cant = 0;
        if(estacion.equals("Buenos Aires")||estacion.equals("Luján")||estacion.equals("Mercedes")||estacion.equals("Suipacha")||estacion.equals("Chivilcoy")||estacion.equals("Alberti")||estacion.equals("Bragado")) {
            cant = (int) reservas.stream().filter(r -> r.getEstacionDestino().equals(estacion) || r.getEstacionOrigen().equals(estacion)).mapToInt(r -> r.getCantViajeros()).sum();
        }
        else {
            throw new Exception("La estación ingresada es invalida");
        }
        return cant;
    }
}
