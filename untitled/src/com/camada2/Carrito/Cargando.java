package com.company.clase20.mesas;

public class Cargando implements EstadoCarrito{
    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        c.getProductos().add(p);

    }

    @Override
    public void cancelarCarrito() {
        c.setE(new Vacio(c));
        System.out.println("El carrito ha sido cancelado");

    }

    @Override
    public void volver() {
        c.setE(new Vacio(c));
        System.out.println("El carrito está ahora vacío");
    }

    @Override
    public void pagar(){
        System.out.println("Debés pasar al siguiente estado para pagar");
    }

    @Override
    public void pasar() {
        if(c.getProductos().size() == 0){
            System.out.println("No tenés productos en tu carrito, agregá los que quieras para poder pasar a pagar");
        } else c.setE(new Pagando(c));
        System.out.println("Pagando...");

    }
}