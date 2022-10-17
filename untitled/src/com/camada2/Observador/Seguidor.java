package com.camada2.clase26.clase;

public class Seguidor implements Observador{
    private String nombre;
    private String apellido;
    private int cantNotificaciones;

    public Seguidor(String nombre, String apellido, int cantNotificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantNotificaciones = cantNotificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCantNotificaciones() {
        return cantNotificaciones;
    }

    public void setCantNotificaciones(int cantNotificaciones) {
        this.cantNotificaciones = cantNotificaciones;
    }

    @Override
    public String actualizar() {
        cantNotificaciones++;
        return nombre + " ::tienes una nueva notificacion:: ";
    }
}
