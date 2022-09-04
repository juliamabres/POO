package com.camada2.clase6Mesa;

import java.time.LocalDate;

public class Perro {
    private String nombrePila;
    private boolean adoptado;
    private String raza;
    private int anioNacimiento;
    private Double peso;
    private boolean chip;
    private boolean lastimado;

    public Perro(String nombrePila, String raza, int anioNacimiento, Double peso) {
        this.nombrePila = nombrePila;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        chip = true;
        lastimado = false;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }
  // metodos propios

    public int edad(){
        int edad = 2022 - anioNacimiento;
        System.out.println("La edad es: "+ edad);
        return edad;
    }
    public boolean perderse(){
        if(chip == false){
            System.out.println("El perro se puede perder");
            return chip;
        }
        else{System.out.println("El perro NO se puede perder");
            return chip;
        }
    }
    public boolean adoptar(){
        if(lastimado == false && peso > 5.){
            System.out.println("El perro puede ser adoptado");
            return lastimado;
        }else{
            System.out.println("El perro NO puede ser adoptado por que esta lastimado o por que su peso es menor a 5 kg");
            return lastimado;
        }
    }
}
