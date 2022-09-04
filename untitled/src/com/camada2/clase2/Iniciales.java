package com.camada2.clase2;

import java.util.Scanner;

public class Iniciales {
    public static void main(String[] args) {
    //INGRESO DE DATOS - SCANNER
    Scanner scanner;
    scanner= new Scanner(System.in);
    int edad;
    String nombre;
    String apellido;
    char inicial;
        System.out.println("Ingrese su nombre");
    nombre=scanner.nextLine();
        System.out.println("Ingrese su apellido");
    apellido=scanner.nextLine();
        System.out.println("Ingrese su edad");
    edad=scanner.nextInt();
    // Ejercicio 1
    //Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
    //una tercera tus iniciales.
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        String iniciales = inicialNombre + ""+ inicialApellido;

        System.out.println("Sus iniciales son: "+ iniciales);

        System.out.println("Ingresa tu dia de nacimiento: ");
        int diaN = scanner.nextInt();
        System.out.println("Ingresa tu mes de nacimiento: ");
        int mesN = scanner.nextInt();
        System.out.println("Ingresa tu año de nacimiento: ");
        int anioN = scanner.nextInt();

        System.out.println("Nombre: "+nombre+ " "+ apellido +
                "\n Iniciales: " +iniciales+"\n Fecha de Nacimiento: "+
                mostrarFechaNac(anioN, mesN, diaN));

    }
    //otro metodo, fuera clase main
    static String mostrarFechaNac(int anio, int mes, int dia){
    String nacimiento = dia + "/" + mes + "/" + anio;
    return nacimiento;
    }
}

