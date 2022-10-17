package com.camada2.clase19mesa;

public class ProductoFactory {
    //Singleton
    private static ProductoFactory instancia;

    private ProductoFactory(){
    }

    public static ProductoFactory getInstancia(){
        if(instancia==null)
            instancia = new ProductoFactory();
        return instancia;
    }

    //Factory
    public Producto construirProducto(String tipo) throws RuntimeException{
        switch (tipo) {
            case "CAJA10X10":
                Caja prodCaja = new Caja();
                prodCaja.setAltura(10.);
                prodCaja.setAncho(10.);
                prodCaja.setLongitud(10.);
                return prodCaja;
            case "PELOTAFUTBOL":
                Pelota prodPelotaFutbol = new Pelota();
                prodPelotaFutbol.setRadio(11.);
                return prodPelotaFutbol;
            case "PELOTATENIS":
                Pelota prodPelotaTenis = new Pelota();
                prodPelotaTenis.setRadio(0.32);
                return prodPelotaTenis;
            default:
                throw new RuntimeException("No se encontro el tipo de producto");
        }
    }
}
