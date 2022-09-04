package com.company.practicaparcial1ExamenParcialyFinal;

public class MainExamenes {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Pepe", "Milanesa", "123456");

        ExamenParcial examenParcial = new ExamenParcial("Poo", "Examen parcial de Poo", 10., alumno, 2, 2  );

        ExamenFinal examenFinal = new ExamenFinal("Final de poo", "ya te dije", 10, alumno, 9., "Patrones de diseño");
        ExamenFinal examenFinal2 = new ExamenFinal("otro final de poo", "ya te dije", 7, alumno, 9., "Patrones de diseño");

        //System.out.println(alumno);
        System.out.println(examenParcial);
        //System.out.println(examenFinal);
        //        System.out.println("--------------------------");
        //        System.out.println(examenFinal.compareTo(examenFinal2));


    }
}
