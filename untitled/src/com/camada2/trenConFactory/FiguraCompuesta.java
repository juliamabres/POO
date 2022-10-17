package com.comada2.trenConFactory;


import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta implements Figura{

    private List<Figura> figuras = new ArrayList<Figura>();

    public void agregar(Figura f) {
        figuras.add(f);
    }


    public double calcularArea(){
        double area=0;
        for(Figura f : figuras)
            area += f.calcularArea();
        return area;
    }

    
    public void agregarFigura(Figura f){
        figuras.add(f);
    }

}