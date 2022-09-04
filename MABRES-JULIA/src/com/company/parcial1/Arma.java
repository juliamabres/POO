package com.company.Parcial1;

public abstract class Arma {

    private Policia policia;
    private int cantMuniciones;
    private double metrosDeAlcance;
    private String marca;
    private int calibre;
    private String estado;

    public Arma(Policia policia, int cantMuniciones, double metrosDeAlcance, String marca, int calibre, String estado) {
        this.policia = policia;
        this.cantMuniciones = cantMuniciones;
        this.metrosDeAlcance = metrosDeAlcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public boolean estaenCondicionesUso(){
       return (estado.equals("EN USO") && calibre >=9);
    }

    public double getMetrosDeAlcance() {
        return metrosDeAlcance;
    }


    @Override
    public String toString(){
        return
                policia.toString() + "\n" +
                        "Cantidad de Municiones: " + cantMuniciones + "\n" +
                        "Metros de Alcance: " + metrosDeAlcance + "\n" +
                        "Marca: " + marca+ "\n" +
                        "Calibre: " + calibre + "\n" +
                        "Estado: "+ estado + "\n" +
                        "Esta en condiciones de Uso?: "+ (estaenCondicionesUso() ? "Si": "No");
    }

}
