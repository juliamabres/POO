package com.company.practicaparcial1Supermercado;

import com.company.practicaparcial1Embarcaciones.Yate;

public class EnvioDomicilio extends Caja implements Comparable{
        private int cantPedidosMes;
        private int camionesDespachados;

    public EnvioDomicilio(double cantDinero, int cantTicketEmitidos, boolean aceptaCredito, Persona persona, int cantPedidosMes, int camionesDespachados) {
        super(cantDinero, cantTicketEmitidos, aceptaCredito, persona);
        this.cantPedidosMes = cantPedidosMes;
        this.camionesDespachados = camionesDespachados;
    }

    @Override
    public int compareTo(Object o) {
        EnvioDomicilio EnvDomAux = (EnvioDomicilio) o;
        int resultado = 0;
        if (cantPedidosMes > EnvDomAux.cantPedidosMes){
            resultado = 1;
        }
        if (cantPedidosMes < EnvDomAux.cantPedidosMes){
            resultado = -1;
        }
        return resultado;
    }
    @Override
    public String toString(){
        return
                "---- Envio a domicilio ----"+ "\n" +
                        super.toString()+ "\n" +
                        "Cantidad de Pedidos: " + cantPedidosMes + "\n" +
                        "Camiones Despachados: " + camionesDespachados;
    }
}
