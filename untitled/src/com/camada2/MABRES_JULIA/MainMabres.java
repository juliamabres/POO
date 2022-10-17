package com.camada2.MABRES_JULIA;

public class MainMabres {
    public static void main(String[] args) {
        Carga carga1 = (Carga) CargaFactory.getInstancia().crearCarga("Simple");
        carga1.setNombre("TV");
        carga1.setDescripcion("TV 32’ LCD");
        ((Simple)carga1).setPesoCargaSimple(3);
        ((Simple)carga1).setRefrigeracion(false);

        Carga carga2 = (Carga) CargaFactory.getInstancia().crearCarga("Simple");
        carga2.setNombre("Medicamentos");
        carga2.setDescripcion("Caja de Medicamentos");
        ((Simple)carga2).setPesoCargaSimple(2);
        ((Simple)carga2).setRefrigeracion(true);

        Contenedor cont1 = (Contenedor) CargaFactory.getInstancia().crearCarga("Contenedor");
        cont1.setNombre("Contenedor 1");
        cont1.setDescripcion("Contenedor 1");
        ((Contenedor)cont1).setPesoContenedor(100);
        ((Contenedor)cont1).agregarCarga(carga1);
        ((Contenedor)cont1).agregarCarga(carga2);

        Barco barco1 = new Barco("Fragata Julia");
        barco1.getCargas().add(carga1);
        barco1.getCargas().add(carga2);
        barco1.getCargas().add(cont1);
        barco1.mostrarCargas();

    }
}
