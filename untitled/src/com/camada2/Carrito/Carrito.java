package com.company.clase20.mesas;


import java.util.ArrayList;

public class Carrito{

    private EstadoCarrito e;
    private ArrayList<Producto> productos;

    public Carrito() {
        e = new Vacio(this);
        productos = new ArrayList<>();
    }


    public EstadoCarrito getE() {
        return e;
    }

    public void setE(EstadoCarrito e) {
        this.e = e;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }


    public void vaciarCarrito(){
        this.productos = new ArrayList<>();
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos(){
        System.out.println("---Productos---");
        for (Producto p : productos){

            System.out.println("Descripcion: " + p.getDescripcion() + '\n' +
                    "Precio " + p.getPrecio() + ".");
            System.out.println("-----------------------------------");
        }
    }


    public void agregarProducto(Producto p) {
        e.agregarProducto(p);
    }


    public void cancelarCarrito() {
        e.cancelarCarrito();
    }


    public void pagar(){
        e.pagar();
    }


    public void volver() {
        e.volver();
    }


    public void pasar() {
        e.pasar();
    }


}