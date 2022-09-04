package com.company.practicaparcial1Supermercado;

public abstract class Caja {
    private double cantDinero;
    private int cantTicketEmitidos;
    private boolean aceptaCredito;
    private Persona persona;

    public Caja(double cantDinero, int cantTicketEmitidos, boolean aceptaCredito, Persona persona) {
        this.cantDinero = cantDinero;
        this.cantTicketEmitidos = cantTicketEmitidos;
        this.aceptaCredito = aceptaCredito;
        this.persona = persona;
    }

    public boolean puedeRetirar(){
        return cantTicketEmitidos >= 100;
    }

    @Override
    public String toString(){
        return
                persona.toString() + "\n" +
                        "---Caja---"+ "\n" +
                        "Cantidad de Dinero: " + cantDinero + "\n" +
                        "Cantidad de Ticket: " + cantTicketEmitidos + "\n" +
                        "Acepta Credito: " + (aceptaCredito ? "Si": "No");
    }
}
