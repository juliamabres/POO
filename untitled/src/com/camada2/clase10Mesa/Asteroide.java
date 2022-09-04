package com.camada2.clase10Mesa;

public class Asteroide extends Objeto1 {

    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }
    @Override
    public void irA(int posx, int posy, char direccion) {
        super.irA(posx, posy, direccion);
    }
}
