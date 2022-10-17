package com.camada2.clase26.clase;

public interface Observable {
    public void agregarObservador(Observador o);
    public void eliminarObservador(Observador o);
    public void notificar();
}
