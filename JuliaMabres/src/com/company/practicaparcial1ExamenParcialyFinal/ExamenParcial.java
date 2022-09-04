package com.company.practicaparcial1ExamenParcialyFinal;

public class ExamenParcial extends Examen{
    private int numeroUnidad;
    private int numeroReintento;

    public ExamenParcial(String titulo, String enunciado, double nota, Alumno alumno, int numeroUnidad, int numeroReintento) {
        super(titulo, enunciado, nota, alumno);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintento = numeroReintento;
    }

    //Un parcial se
    //puede recuperar hasta 3 veces si la unidad es inferior o igual a la 3 o 2 veces si la unidad es
    //mayor a la 3.
    public boolean sePuedeRecuperar(){
        return (numeroReintento<=3 && numeroUnidad <= 3) || (numeroReintento<=2 && numeroUnidad > 3);
    }


    @Override
    public  String toString(){
        //String recuperar = sePuedeRecuperar() ? "Tiene la posibilidad de recuperar": "Ya no posee la posibilidad de recuperar";
        return "---EXAMEN PARCIAL---" + "\n" +
                super.toString() + "\n" +
                "Numero de unidad: " + numeroUnidad + "\n" +
                "Numero de reintento: " + numeroReintento + "\n" +
                "Se puede recuperar: " + (sePuedeRecuperar() ? "Tiene la posibilidad de recuperar": "Ya no posee la posibilidad de recuperar"); //recuperar
    }
}
