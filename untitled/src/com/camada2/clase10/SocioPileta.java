package com.camada2.clase10;

public class SocioPileta extends Socio {
    private Double costoPileta;
    private Boolean habilitado;

    public SocioPileta(String numeroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta, boolean habilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }

    @Override
    public Double calcularCostoMensual() {
        Double costoTotal = 0.;
        if (habilitado) {
            costoTotal = getCuotaMensual() + costoPileta;
        } else {
            //llamo al metodo del padre, en este caso es igual que poner el get
            costoTotal = super.calcularCostoMensual();
        }
        return costoTotal;
    }

    // siempre sobreescribir toString
    @Override
    public String toString() {
        String hab = habilitado ? "Si" : "No";
        return "Nombre: " + getNombre() + "\n" +
                "Numero de Socio: " + getNumeroSocio() + "\n" +
                "Actividad: " + getActividad() + "\n" +
                "Habilitado para la pileta: " + hab;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * habilitado.hashCode();
        hash = hash * costoPileta.hashCode();
        return hash;
    }
    // si costoPileta fuera double, pondria asi: hash = (int) (hash*costoPileta); Variable de tipo primitiva se castea

    // no se puede comparar con ==, va a la memoria
    @Override
    public boolean equals(Object o) {

        //  if (o == null || getClass() != o.getClass()) return false;

        if (o == null || !(o instanceof Socio)) return false;
        else {
            SocioPileta socioAuxiliar = (SocioPileta) o;
            return getNumeroSocio().equals(socioAuxiliar.getNumeroSocio()) &&
                    getNombre().equals(socioAuxiliar.getNombre()) &&
                    habilitado.equals(socioAuxiliar.habilitado);
        }
        //otra opcion en vez de los if return Double.compare(costoPileta, socioAuxiliar.costoPileta) == 0 && habilitado.equals(socioAuxiliar.habilitado);
    }
}


