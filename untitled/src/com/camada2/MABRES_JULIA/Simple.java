package com.camada2.MABRES_JULIA;

public class Simple extends Carga{
    private double pesoCargaSimple;
    private boolean refrigeracion;

    public double getPesoCargaSimple() {
        return pesoCargaSimple;
    }

    public void setPesoCargaSimple(double pesoCargaSimple) {
        this.pesoCargaSimple = pesoCargaSimple;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    @Override
    public double pesoCarga() {
        double total = pesoCargaSimple;
        if(refrigeracion){
            total*=1.1;
        }
        return total;
    }
}
