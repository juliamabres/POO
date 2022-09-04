package com.camada2.clase3;

import java.util.Scanner;

public class MesaEj3y4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //variable i para usar de indice
        int cantPrimos = 0;
        int contador = 2;

        System.out.println("Los primeros " + n + " numeros primos son: ");
        while(cantPrimos<n){
            int divisor = 1;

            for(int i = 2; i <= contador; i++){
                if(contador%i == 0){
                    divisor++;
                }
            }
            if(divisor==2){
                cantPrimos++;
                System.out.println(contador);
            }
            contador++;
        }

        System.out.println("Ingresa horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        scanner.nextLine();

        double sueldoSemanal = 0;
        if (horasTrabajadas>40){
            sueldoSemanal = (horasTrabajadas-40)*(875*1.5) + (40*875);
        } else{
            sueldoSemanal = horasTrabajadas*875;
        }
        System.out.println("El sueldo semanal con horas extras de Julieta es de: $" + sueldoSemanal);
    }
}
