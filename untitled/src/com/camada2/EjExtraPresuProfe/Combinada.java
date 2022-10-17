package com.camada2.EjExtraPresuProfe;
import java.util.ArrayList;
import java.util.List;

public class Combinada extends UnidadTrabajo{
    private double coeficienteGlobal;
    private double montoMaterial;

    private ArrayList<UnidadTrabajo> unidades = new ArrayList<>();


    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public void agregarUnidad(UnidadTrabajo u){
        unidades.add(u);
    }
    @Override
    public double calcularMonto() {
        double monto = 0;
        for (UnidadTrabajo u : unidades){
            monto+=u.calcularMonto();
        }
        return monto*coeficienteGlobal;
    }

    @Override
    public String mostrar() {
        String mensaje =  "----- Paquete de servicios -----\n";
        for (UnidadTrabajo u : unidades)
        {
            mensaje = mensaje.concat(u.mostrar());
        }
        return mensaje +"--------------------------------\n";
    }
}
