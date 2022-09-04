package com.camada2.clase5Mesa;

public class UsuarioJuego {
    //atributos
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    //constructor
    public UsuarioJuego(String nombre, String clave, Double puntaje, int nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    //setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //metodos, procedimientos

    public Double aumentarPuntaje(){
        puntaje+=1;
        System.out.println("Su puntaje actual es: "+puntaje);
        return puntaje;
    }
    public int subirNivel(){
        nivel+=1;
        System.out.println("Su nivel actual es: "+nivel);
        return nivel;
    }
    public Double bonus(int numero){
        puntaje=puntaje+numero;
        System.out.println("Su puntaje con bonus es: "+puntaje);
        return puntaje;
    }
}
