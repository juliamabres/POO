package com.camada2.PreParcial2DOS;

import java.util.ArrayList;
import java.util.List;

public class Barrio extends Propiedad{
    private int factorMultiplicador;
    private List<Propiedad> casas = new ArrayList<>();

    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }

    public List<Propiedad> getCasas() {
        return casas;
    }

    public void setCasas(List<Propiedad> casas) {
        this.casas = casas;
    }

    @Override
    public double calcularImpuesto() {
        double total = 0;
        for(Propiedad c: casas){
            total += c.calcularImpuesto();
        }
        return total*factorMultiplicador;
    }
}
