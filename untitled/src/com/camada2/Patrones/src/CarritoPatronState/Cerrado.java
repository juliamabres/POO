package com.company.clase20.mesas;
public class Cerrado implements EstadoCarrito{
    private Carrito c;

    public Cerrado(Carrito c) {
        this.c = c;
    }

    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        System.out.println("El carrito ya ha sido cerrado");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No es posible cancelar el carrito");
    }

    @Override
    public void volver() {
        System.out.println("No es posible volver atrás");
    }

    @Override
    public void pagar(){
        System.out.println("El carrito ya ha sido pagado");
    }

    @Override
    public void pasar() {
        c.setE(new Vacio(c));
        System.out.println("Carrito vacío.");
    }
}