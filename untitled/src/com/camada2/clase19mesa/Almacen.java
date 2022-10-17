package com.camada2.clase19mesa;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
        private String razonSocial;
        private List<Producto> productos;

        public Almacen(String razonSocial) {
            this.razonSocial = razonSocial;
            this.productos = new ArrayList<>();
        }

        public void agregarProducto(Producto p){
            productos.add(p);
        }

        public void mostrarProductos() throws NullPointerException{
            if (productos.isEmpty()){
                throw new NullPointerException("No hay productos disponibles");
            }
            for (Producto p : productos){
                System.out.println(p);
            }
        }
        public double calcularEspacioNecesario() throws NullPointerException{
            double total = 0;
            if(productos.isEmpty()) throw new NullPointerException("No hay productos");
            for (Producto p : productos){
                total += p.calcularEspacio();
                  }
            System.out.print("Total espacio necesario: ");
            return total;
        }


}
