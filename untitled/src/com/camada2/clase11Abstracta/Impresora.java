package com.camada2.clase11Abstracta;

public abstract class Impresora {
     private String modelo;
     private String tipoConexio;
     private String fechaFabricacion;
     private int hojasDisponibles;
     private double porcentajeTinta;

     public Impresora(String modelo, String tipoConexio, String fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
          this.modelo = modelo;
          this.tipoConexio = tipoConexio;
          this.fechaFabricacion = fechaFabricacion;
          this.hojasDisponibles = hojasDisponibles;
          this.porcentajeTinta = porcentajeTinta;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public String getTipoConexio() {
          return tipoConexio;
     }

     public void setTipoConexio(String tipoConexio) {
          this.tipoConexio = tipoConexio;
     }

     public String getFechaFabricacion() {
          return fechaFabricacion;
     }

     public void setFechaFabricacion(String fechaFabricacion) {
          this.fechaFabricacion = fechaFabricacion;
     }

     public int getHojasDisponibles() {
          return hojasDisponibles;
     }

     public void setHojasDisponibles(int hojasDisponibles) {
          this.hojasDisponibles = hojasDisponibles;
     }

     public double getPorcentajeTinta() {
          return porcentajeTinta;
     }

     public void setPorcentajeTinta(double porcentajeTinta) {
          this.porcentajeTinta = porcentajeTinta;
     }

     public boolean tienePapel(){
       return hojasDisponibles > 0;
     }

     public boolean necesitaTinta(){
        return porcentajeTinta < 0.05;
     }
     //no tiene cuerpo el metodo abstracto
     public abstract String imprimir();
}
