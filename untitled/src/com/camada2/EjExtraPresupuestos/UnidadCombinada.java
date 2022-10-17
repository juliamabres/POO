package com.camada2.EjExtraPresupuestos;


import java.util.ArrayList;
import java.util.List;

public class UnidadCombinada extends UnidadDeTrabajo{
    private double coeficienteGlobal;
    private int montoDeMaterial;
    private List<UnidadDeTrabajo> unidades = new ArrayList<UnidadDeTrabajo>();

    public double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public int getMontoDeMaterial() {
        return montoDeMaterial;
    }

    public void setMontoDeMaterial(int montoDeMaterial) {
        this.montoDeMaterial = montoDeMaterial;
    }

    public List<UnidadDeTrabajo> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<UnidadDeTrabajo> unidades) {
        this.unidades = unidades;
    }

    public void agregarUnidad(UnidadDeTrabajo unidad){
        unidades.add(unidad);
        System.out.println("La unidad "+unidad.getNombre()+" ha sido agregada");
    }
    @Override
    public double calcularMonto() {
        double sumaTotal = 0;
        for(UnidadDeTrabajo u: unidades){
            sumaTotal+=u.calcularMonto();
        }
        return sumaTotal*coeficienteGlobal;
    }


    @Override
    public String toString() {
        return super.toString()+
                "Monto de Unidad Combinada: "+calcularMonto();
    }
}
