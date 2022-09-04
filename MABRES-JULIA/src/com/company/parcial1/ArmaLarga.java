package com.company.Parcial1;


public class ArmaLarga extends Arma implements Comparable{
    private boolean tieneSelloRENAR;
    private String descripcionUso;
    private int nivelArma;

    public ArmaLarga(Policia policia, int cantMuniciones, double metrosDeAlcance, String marca, int calibre, String estado, boolean tieneSelloRENAR, String descripcionUso, int nivelArma) {
        super(policia, cantMuniciones, metrosDeAlcance, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivelArma = nivelArma;
    }
    @Override
    public int compareTo(Object o) {
        ArmaLarga ALAux = (ArmaLarga) o;
        int resultado = 0;
        if (nivelArma > ALAux.nivelArma){
            resultado = 1;
            System.out.println("Si");
        }
        if (nivelArma < ALAux.nivelArma){
            resultado = -1;
            System.out.println("No");
        }
        return resultado;
    }

    @Override
    public String toString(){
        return
                "---- Arma Larga ----"+ "\n" +
                        super.toString()+ "\n" +
                        "Tiene sello RENAR: " + (tieneSelloRENAR ? "Si" : "No") + "\n" +
                        "Descripcion de Uso: " + descripcionUso + "\n" +
                        "Nivel de arma: " + nivelArma;
    }

}
