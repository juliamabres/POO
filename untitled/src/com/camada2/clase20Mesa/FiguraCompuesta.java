package com.camada2.clase20Mesa;
import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta implements Figura{

    List<Figura> figuras;

    public FiguraCompuesta() {

        figuras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public double calcularArea() {
        double total = 0;
        for(Figura f: figuras){
            total += f.calcularArea();
        }
        return total;
    }
}
