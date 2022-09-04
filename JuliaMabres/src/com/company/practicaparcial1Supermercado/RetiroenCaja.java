package com.company.practicaparcial1Supermercado;

public class RetiroenCaja extends Caja{

    private Double dineroEfvo;
    private Integer unidadesCobradas;
    private String categoria;

    public RetiroenCaja(double cantDinero, int cantTicketEmitidos, boolean aceptaCredito, Persona persona, Double dineroEfvo, Integer unidadesCobradas, String categoria) {
        super(cantDinero, cantTicketEmitidos, aceptaCredito, persona);
        this.dineroEfvo = dineroEfvo;
        this.unidadesCobradas = unidadesCobradas;
        this.categoria = categoria;
    }

    public boolean esRapida(){
        return categoria.equals("rapida");
    }

    @Override
    public String toString(){
        return
                "---- Retiro en Caja ----"+ "\n" +
                        super.toString()+ "\n" +
                        "Dinero en efectivo: " + dineroEfvo + "\n" +
                        "Unidades Cobradas: " + unidadesCobradas + "\n" +
                        "Categoria: "+ categoria;
    }
}
