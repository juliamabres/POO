package com.company.practicaparcial1Embarcaciones;


public class Yate extends Embarcacion implements java.lang.Comparable {
    private int cantCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int cantCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public String toString(){
        return
                "---- Yate ----"+ "\n" +
                        super.toString()+ "\n" +
                        "Cantidad Camarotes: " + cantCamarotes;
    }
    @Override
    public int compareTo(Object o) {
        Yate YateAux = (Yate) o;
        if (cantCamarotes > YateAux.cantCamarotes){
            return 1;
        }
        if (cantCamarotes < YateAux.cantCamarotes){
            return -1;
        }
        return 0;
    }


}
