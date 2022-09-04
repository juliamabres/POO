package com.camada2.clase2;

import java.util.Scanner;

public class Mesa {

    public static void main(String[] args) {
        Scanner scanner;
        scanner= new Scanner(System.in);
        //ejercicio1
        System.out.println("Ingresa un numero: ");
        int numero= scanner.nextInt();
        System.out.println("Es primo?: "+ esPrimo(numero));

        //ejercicio2
        System.out.println("Ingresa numero a comparar: ");
        int numeroA= scanner.nextInt();
        System.out.println("Ingresa otro numero a comparar: ");
        int numeroB= scanner.nextInt();
        System.out.println("Ingresa otro numero a comparar: ");
        int numeroC= scanner.nextInt();

        System.out.println("El mayor es: "+ elMayor(numeroA, numeroB, numeroC) );

        //ejercicio3
        String palabra1;
        String palabra2;

        System.out.println("Ingresa una palabra: ");
        palabra1= scanner.next();

        System.out.println("Ingresa otra palabra: ");
        palabra2= scanner.next();

        System.out.println(palabra1.equals(palabra2));

    }

        static boolean esPrimo(int n) {
            for(int i=2;i<n;i++) {
                if(n%i==0)
                    return false;
            }
            return true;
        }
        // OTRA FORMA:
        // static  boolean esPrimo(int n, int divisor)
        //    {
        //        if(divisor == 1){
        //            return true;
        //        }
        //        if(n % divisor == 0){
        //            return false;
        //        }
        //        return esPrimo(n, divisor - 1);
        //
        //    }
        static int elMayor(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        else if(num3>num1 && num3>num2){
            return num3;
        }
        else{
            return -1;
        }
        }
    }
    //OTRA FORMA:
    //static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
//    {
//        if((unNumeroA> unNumeroB) && ( unNumeroA > unNumeroC) ){
//            return unNumeroA;
//        } else if (((unNumeroB> unNumeroA) && ( unNumeroB > unNumeroC) )) {
//            return unNumeroB;
//        }else {
//            return unNumeroC;
//        }
//    }

//EJERCICIO 3, CON METODO AFUERA
//static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
//    {
//        if (unTextoA.equals(unTextoB)){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//}



