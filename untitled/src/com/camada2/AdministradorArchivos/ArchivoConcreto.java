package com.camada2.AdministradorArchivos;

public class ArchivoConcreto extends Archivo{
    private String tipoArchivo;

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    @Override
    public String toString() {
        return
                super.toString()+" "+
                "de tipo: " + tipoArchivo+"\n";
    }
}
