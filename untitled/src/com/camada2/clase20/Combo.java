package com.camada2.clase20;
import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto{

    private List<Producto> productos;
    private double descuento;

    public Combo(String nombre, double precio, double descuento) {
        super(nombre, precio);
        productos = new ArrayList<>();
        this.descuento = descuento;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
     System.out.println("El producto "+producto.getNombre()+" ha sido agregado al combo");
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for(Producto p: productos){
            total+=p.getPrecio();
        }
        total*=(1-descuento);
        setPrecio(total);
        return total;
    }
}
