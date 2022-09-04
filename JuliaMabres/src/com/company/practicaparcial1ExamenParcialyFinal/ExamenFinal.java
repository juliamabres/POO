package com.company.practicaparcial1ExamenParcialyFinal;

public class ExamenFinal extends Examen implements Comparable {
    private double notaOral;
    private String temaOral;

    public ExamenFinal(String titulo, String enunciado, double nota, Alumno alumno, double notaOral, String temaOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado() {
        return super.estaAprobado() && notaOral >=4;
    }

    @Override
    public String toString() {

        return "---EXAMEN FINAL---" + "\n" +
                super.toString() + "\n" +
                "Tema oral: " + temaOral+ "\n" +
                "Nota oral: " + notaOral + "\n" +
                "Esta aprobado: " + (estaAprobado() ? "Final aprobado": "Final desaprobado");
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal exAux = (ExamenFinal) o;
        int resultado = 0;
        //double promedioThis = (getNota() + notaOral)/2;
        //double promedioAux = (exAux.getNota() + exAux.notaOral)/2;

        if (calcularPromedio() > exAux.calcularPromedio()){
            resultado = 1;
        }
        if (calcularPromedio()< exAux.calcularPromedio()){
            resultado = -1;
        }
        return resultado;
    }

    public Double calcularPromedio(){
        return (getNota() + notaOral)/2;
    }


}
