package com.company;

public class ProductoFactory {
    //Singleton  ---------------------
    private static ProductoFactory instancia;

    private ProductoFactory() {
    };

    public static ProductoFactory getInstancia() {
        if (instancia == null)
            instancia = new ProductoFactory();
        return instancia;
    }
    // Fin Singleton -------------------

    //Factory  ---------------------

    public ProductoAbstracto crearProducto(String tipo) throws Exception {
        switch (tipo) {
            case "Producto1":/// caso en que tengamos que devolver un tipo de producto con sus propiedades ya cargadas. Ejemplo Ejercicio Caja Pelotas.
                Producto1 nombreObjeto = new Producto1();
                nombreObjeto.setAtributo(10.);   // el set debe estar construido en la clase Producto1.
                return nombreObjeto; // se devuelve el objeto ya configurado en las 2 lineas anteriores.
            case "Producto2": /// caso en que solo se elija construir  un tipo de producto 2, sin setear los atributos
                return new Producto2();
            case "Producto3": /// caso en que solo se elija construir  un tipo de producto 3, sin setear los atributos
                return new Producto3();
            case "ProductoCompuesto":
                return new ProductoComposite(); /// caso en que solo se elija construir  un tipo  de producto Composite
            default:
                throw new RuntimeException("Por el momento no estamos construyendo ese tipo de Producto");
        }
    }
}