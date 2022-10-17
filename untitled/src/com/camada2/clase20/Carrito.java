package com.camada2.clase20;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private int numero;
    private List<Producto> productos;

    public Carrito(int numero) {
        this.numero = numero;
        productos = new ArrayList<>();
    }

    public double calcularTotal(){
        double total = 0;
        for(Producto p : productos){
            total+=p.getPrecio();
        }
        return total;
    }
}
