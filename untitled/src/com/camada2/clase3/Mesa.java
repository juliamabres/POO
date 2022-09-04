package com.camada2.clase3;
import java.util.Scanner;

public class Mesa {

    static int cualGana() {
        Scanner scanner = new Scanner(System.in);
        String jugada1;
        String jugada2;
        int contador1 = 0;
        int contador2 = 0;
        System.out.println("Jugador 1 ingrese su opcion: ");
        jugada1 = scanner.nextLine();
        System.out.println("Jugador 2 ingrese su opcion: ");
        jugada2 = scanner.nextLine();

        while (!(jugada1.equals("*")) || !(jugada2.equals("*"))) {
            System.out.println("Jugador 1 ingrese su opcion: ");
            jugada1 = scanner.nextLine();
            System.out.println("Jugador 2 ingrese su opcion: ");
            jugada2 = scanner.nextLine();

            if ((jugada1.equals("piedra") && jugada2.equals("papel")) ||
                    (jugada1.equals("papel") && jugada2.equals("tijera")) ||
                    (jugada1.equals("tijera") && jugada2.equals("piedra"))
            ) {
                contador2++;
            } else if ((jugada2.equals("piedra") && jugada1.equals("papel")) ||
                    (jugada2.equals("papel") && jugada1.equals("tijera")) ||
                    (jugada2.equals("tijera") && jugada1.equals("piedra"))
            ) {
                contador1++;
            } else if (jugada1.equals(jugada2)) {
                contador1 += 0;
                contador2 += 0;
            }
        }
        if (contador1 > contador2) {
            return 1;
        } else if (contador2 > contador1) {
            return 2;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("El ganador es: " + cualGana());
    }
}

