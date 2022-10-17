package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductoComposite extends ProductoAbstracto {


    private List<ProductoAbstracto> listaProductosCompuesto = new ArrayList<ProductoAbstracto>();

    public void agregarProductocompuesto(ProductoAbstracto p){
        listaProductosCompuesto.add(p);}


}
