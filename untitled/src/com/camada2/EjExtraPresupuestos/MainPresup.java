package com.camada2.EjExtraPresupuestos;


public class MainPresup {
    public static void main(String[] args) {
         try {
                 UnidadDeTrabajo mantenimiento = UnidadDeTrabajoFactory.getInstance().crearUnidad("Unidad Simple");
                 ((UnidadSimple) mantenimiento).setNombre("Mantenimiento");
                 ((UnidadSimple) mantenimiento).setDescripcion("Arreglar");
                 ((UnidadSimple) mantenimiento).setMontoXPersona(120000);
                 ((UnidadSimple) mantenimiento).setCantPersonas(4);

                 UnidadDeTrabajo limpieza = UnidadDeTrabajoFactory.getInstance().crearUnidad("Unidad Simple");
                 ((UnidadSimple) limpieza).setNombre("Limpieza");
                 ((UnidadSimple) limpieza).setDescripcion("Limpiar y Ordenar");
                 ((UnidadSimple) limpieza).setMontoXPersona(100000);
                 ((UnidadSimple) limpieza).setCantPersonas(24);

                 UnidadDeTrabajo serviciosGenerales = UnidadDeTrabajoFactory.getInstance().crearUnidad("Unidad Combinada");
                 ((UnidadCombinada) serviciosGenerales).setNombre("Servicios Generales");
                 ((UnidadCombinada) serviciosGenerales).setDescripcion("Servicios Generales");
                 ((UnidadCombinada) serviciosGenerales).setCoeficienteGlobal(3);
                 ((UnidadCombinada) serviciosGenerales).agregarUnidad(limpieza);
                 ((UnidadCombinada) serviciosGenerales).agregarUnidad(mantenimiento);

                 System.out.println("El monto total de la unidad de mantenimiento es " + mantenimiento.calcularMonto());
                 System.out.println("El monto total de la unidad de mantenimiento es " + limpieza.calcularMonto());
                 System.out.println(((UnidadCombinada) serviciosGenerales).calcularMonto());
         }
         catch (Exception e){
                 System.err.println(e.getMessage());
         }


    }
}