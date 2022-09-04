package com.camada2.clase6;

import java.time.LocalDate;

public class Impresora {
    //atributos
    private String modelo;
    private String tipoConexion;
    private LocalDate fechaFabricacion;
    private int hojasDisponibles;
    private boolean tieneTinta;
    private boolean estaEncendida;

    //constructor

    public Impresora(String modelo, String tipoConexion, LocalDate fechaFabricacion, int hojasDisponibles) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        tieneTinta = true;
        estaEncendida = true;
    }


// get y set

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public boolean isTieneTinta() {
        return tieneTinta;
    }

    public void setTieneTinta(boolean tieneTinta) {
        this.tieneTinta = tieneTinta;
    }

    public boolean isEstaEncendida() {
        return estaEncendida;
    }

    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }
   //metodos propios

   public boolean tienePapel(){
        return hojasDisponibles > 0;
   }

   public void imprimir(String texto){
        if(estaEncendida){
             if(tienePapel()){
                 if(tieneTinta){
                     System.out.println(texto);
                 }else{
                     System.out.println("No tiene tinta");
                 }
             }else{
                 System.out.println("No tiene papel");
             }
        }
        else{
            System.out.println("La impresora esta apagada");
        }
   }

}
