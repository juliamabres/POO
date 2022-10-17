package com.company.clase20.mesas;

public class Vacio implements EstadoCarrito{
    private Carrito c;

    public Vacio(Carrito c) {
        this.c = c;
        this.c.vaciarCarrito();
    }
    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        System.out.println("Debe pasar al siguiente estado para empezar a cargar su carrito");
    }

    @Override
    public void pagar(){
        System.out.println("No hay productos en su carrito");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("El carrito ha sido cancelado");
    }

    @Override
    public void volver() {
        System.out.println("No hay pasos previos");
    }

    @Override
    public void pasar() {
        c.setE(new Cargando(c));
        System.out.println("Carrito siendo cargado...");
    }
}
