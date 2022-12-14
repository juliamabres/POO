package com.company.practicaparcial1ExamenParcialyFinal;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private double nota;

    private Alumno alumno;

    public Examen(String titulo, String enunciado, double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean estaAprobado(){
        return nota>=4;
    }

    @Override
    public String toString(){
        return
                alumno.toString() + "\n" +
                "Titulo: " + titulo + "\n" +
                "Enunciado: " + enunciado + "\n" +
                "Nota: " + nota;
    }
}
