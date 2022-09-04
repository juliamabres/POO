package com.camada2.clase11Abstracta;

public class ImpresoraCannon extends Impresora{

    public ImpresoraCannon(String modelo, String tipoConexio, String fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexio, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public boolean necesitaTinta() {
        return getPorcentajeTinta()<0.15;
    }

    @Override
    public String imprimir() {
        String textoCannon = "";
        if(necesitaTinta()){
            textoCannon = "--- Para impresora Cannon el nivel de tinta es insuficiente!";
        }
        else{
            textoCannon = toString();
        }
        return textoCannon;
    }
    @Override
    public String toString() {
        return "\u001B[31m"+"----- Impresora Cannon -----"+"\u001B[0m" + "\n"+
                "Modelo: " +getModelo()+ "\n"+
                "Tipo de conexion: " +getTipoConexio()+ "\n"+
                "Fecha Fabricacion: " +getFechaFabricacion()+ "\n"+
                "Hojas disponibles: " +getHojasDisponibles()+ "\n"+
                "Porcentaje de tinta: " +getPorcentajeTinta();
    }

}
