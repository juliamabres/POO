package com.company.Parcial1;

public class ArmaCorta extends Arma{

    private boolean automatica;

    public ArmaCorta(Policia policia, int cantMuniciones, double metrosDeAlcance, String marca, int calibre, String estado, boolean automatica) {
        super(policia, cantMuniciones, metrosDeAlcance, marca, calibre, estado);
        this.automatica = automatica;
    }

    public boolean disparoMas200(){
        return getMetrosDeAlcance() > 200;
    }

    @Override
    public String toString(){
        return
                "---- Arma corta ----"+ "\n" +
                        super.toString()+ "\n" +
                        "Es Automatica: " + (automatica ? "Si": "No") + "\n" +
                         "Tiene mas de 200 metros de alcance?: "+ (disparoMas200() ? "Si" : "No");
    }
}
