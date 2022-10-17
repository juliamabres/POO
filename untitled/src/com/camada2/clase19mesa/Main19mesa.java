package com.camada2.clase19mesa;


public class Main19mesa {
    public static void main(String[] args) {
        Almacen alm = new Almacen("Super POO");


        Producto pro1 = ProductoFactory.getInstancia().construirProducto("CAJA10X10");
        pro1.setPeso(20.);
        Producto pro2 = ProductoFactory.getInstancia().construirProducto("PELOTAFUTBOL");
        pro1.setPeso(11.);
        Producto pro3 = ProductoFactory.getInstancia().construirProducto("PELOTATENIS");
        pro1.setPeso(0.32);

        System.out.println(pro1.calcularEspacio());
        System.out.println(pro2.calcularEspacio());
        System.out.println(pro3.calcularEspacio());
        alm.agregarProducto(pro1);
        alm.agregarProducto(pro2);
        alm.agregarProducto(pro3);


        try{
            alm.mostrarProductos();
        } catch (NullPointerException e){
            System.err.println(e);
        }

        System.out.println("----Calcular espacio necesario----");
        System.out.println(alm.calcularEspacioNecesario());

    }
}
