//EJERCICIOS PLAYGROUND
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int num=100;
        int num2=20;
        //console.log en JS
        System.out.println("Hola Juli");
        System.out.println("El valor es " + num);
        System.out.println("Multiplicado por 20 es " + num*20);

        //for(Integer i=1; i<=5; i++){
           // System.out.println("5veces");
        //}

        //if(num%num2 == 0){
        //    System.out.println("El resultado de la division es " + num/num2);}
        // else{
         //   System.out.println("No son divisibles");}

        //Ejercicio 1
        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        //mensaje.
        String nombre1 = "julia";
        String nombre2 = "julia";

        if(nombre1.equals(nombre2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son distintas las palabras");
        }

        //Ejercicio 2
        //
        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.

        Integer valor1=30;
        Integer valor2=50;
        int comparar;

        if(valor1.equals(valor2)){
            System.out.println("Son iguales");
        }
        else{
            comparar=valor1.compareTo(valor2);
            if(comparar>0){
                System.out.println("Valor1 mayor a Valor2");
            }
            else{
                System.out.println("Valor2 mayor a Valor1");
            }
        }
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
        System.out.println("Sus iniciales son: "+ nombre.charAt(0)+apellido.charAt(0));
    }
}


