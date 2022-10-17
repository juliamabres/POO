package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private String nombre;
    private List<ProductoAbstracto> listaProductos;

    public Almacen() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProductos(ProductoAbstracto p){
        listaProductos.add(p);
    }

    public void mostrarProductos() throws NullPointerException{
        if (listaProductos.isEmpty()){
            throw new NullPointerException("No hay productos disponibles");
        }
        for (ProductoAbstracto p : listaProductos){
            System.out.println(p);
        }
    }




}
