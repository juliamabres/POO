package com.company.practicaparcial1Embarcaciones;

public class Velero extends Embarcacion{

    private Integer cantMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, Integer cantMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantMastiles = cantMastiles;
    }

    public boolean veleroGrande(){
        return cantMastiles > 4;
    }

    @Override
    public String toString(){
        return
                "---- Velero ----"+ "\n" +
                        super.toString()+ "\n" +
                        "Cantidad Mastiles: " + cantMastiles + "\n" +
                        "Velero Grande: " + (veleroGrande() ? "Si": "No");
    }



}
