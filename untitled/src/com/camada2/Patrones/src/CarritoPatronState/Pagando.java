package com.company.clase20.mesas;

public class Pagando implements EstadoCarrito{
    private Carrito c;

    public Pagando(Carrito c) {
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
        System.out.println("No podés agregar más productos");

    }

    @Override
    public void pagar(){
        double monto = getC().calcularTotal();
        System.out.println("Pagando un total de: $" + monto);
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Ya no podés cancelar el carrito");
    }

    @Override
    public void volver() {
        System.out.println("No se puede volver");
    }

    @Override
    public void pasar() {
        c.setE(new Cerrado(c));
        System.out.println("Carrito cerrado");

    }
}