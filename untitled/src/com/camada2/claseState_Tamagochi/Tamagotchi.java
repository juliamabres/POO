package com.camada2.clase25.tamagotchi;


public class Tamagotchi {
    private Estado estado;

    public Tamagotchi() {
        estado = new Triste(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public void bebe() {
        estado.bebe();
    }


    public void come() {
        estado.come();
    }


    public void recibeMimos() {
        estado.recibeMimos();
    }
}
