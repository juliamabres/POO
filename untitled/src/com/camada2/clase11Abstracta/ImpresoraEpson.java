package com.camada2.clase11Abstracta;

public class ImpresoraEpson extends Impresora{


    public ImpresoraEpson(String modelo, String tipoConexio, String fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexio, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }
   //este metodo es obligatorio sobreescribirlo x que es abstracto en el padre.
    @Override
    public String imprimir() {
        String textoEpson = "";
        if(necesitaTinta() || (!tienePapel())){
            textoEpson = "--- Para impresora Epson el nivel de tinta es insuficiente o tiene falta de papel";
        }
        else{
            textoEpson = this.toString();
        }
        return textoEpson;
    }

    @Override
    public String toString() {
        return "\u001B[34m"+"----- Impresora Epson -----"+"\u001B[0m" + "\n"+
                "Modelo: " +getModelo()+ "\n"+
                "Tipo de conexion: " +getTipoConexio()+ "\n"+
                "Fecha Fabricacion: " +getFechaFabricacion()+ "\n"+
                "Hojas disponibles: " +getHojasDisponibles()+ "\n"+
                "Porcentaje de tinta: " +getPorcentajeTinta();
    }
}
