package com.company.clase20.mesas;

public class Main {
    public static void main(String[] args) {
        //Creamos productos
        Producto p1= new Producto("Paquete de galletitas Oreo", 100.0);
        Producto p2= new Producto("Arroz 1 kg", 150.0);
        Producto p3= new Producto("Mate cocido en saquitos", 100.0);
        Producto p4= new Producto("Shampoo Dove 200ml", 300.0);
        Producto p5= new Producto("Papel de cocina", 160.0);
        Producto p6= new Producto("Detergente Magistral", 190.0);

        //Creamos un carrito cuyo estado inicial es vacio
        Carrito c1 = new Carrito();

        //Agregamos productos
        c1.agregarProducto(p1);

        c1.pasar();

        c1.agregarProducto(p2);
        c1.agregarProducto(p3);
        c1.agregarProducto(p4);
        c1.agregarProducto(p6);

        c1.mostrarProductos();
        System.out.println("El total a pagar del carrito es de $" + c1.calcularTotal());

        c1.pasar();
        c1.cancelarCarrito();
        System.out.println(c1.getE());
        c1.pagar();
        c1.pasar();

    }
}
