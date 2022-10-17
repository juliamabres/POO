package com.camada2.clase26.clase;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable{
    private String nombre;
    private String apellido;
    private List<Observador> seguidores;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        seguidores = new ArrayList<>();
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

    public List<Observador> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(List<Observador> seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public void agregarObservador(Observador o) {
        Seguidor s = (Seguidor)o;
        seguidores.add(s);
        System.out.println(s.getNombre() + " " + s.getApellido() + " ha sido agregado a la lista de seguidores");
    }

    @Override
    public void eliminarObservador(Observador o) {
        Seguidor s = (Seguidor)o;
        seguidores.remove(s);
        System.out.println(s.getNombre() + " " + s.getApellido() + " ha sido eliminado a la lista de seguidores");
    }

    @Override
    public void notificar() {
        for(Observador o : seguidores){
            System.out.println(o.actualizar() + " porque " + nombre + " ha subido una foto nueva");
        }
    }

    public void subirFoto(){
        System.out.println("Has subido una nueva foto correctamente...");
        notificar();
    }
}
