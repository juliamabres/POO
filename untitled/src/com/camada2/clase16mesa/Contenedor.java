package com.camada2.clase16mesa;


public class Contenedor implements Comparable<Contenedor>{
    private Integer numeroID;
    private String pais;
    private boolean marcaMatPeligr;

    public Contenedor(int numeroID, String pais, boolean marcaMatPeligr) {
        this.numeroID = numeroID;
        this.pais = pais;
        this.marcaMatPeligr = marcaMatPeligr;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public String getPais() {
        return pais;
    }

    public boolean isMarcaMatPeligr() {
        return marcaMatPeligr;
    }

    @Override
    public int compareTo(Contenedor c) {

        return Integer.compare(numeroID, c.numeroID);
    }

    @Override
    public String toString(){
        String marcaMatPeligr = this.marcaMatPeligr ? "Si" : "No";
        return "NumeroID contenedor: " + numeroID + "\n"+
                "Pais: " + pais + "\n"+
                "Material Peligroso?: " + marcaMatPeligr;
    }
}
