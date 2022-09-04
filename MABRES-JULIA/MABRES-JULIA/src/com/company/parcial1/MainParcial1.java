package com.company.Parcial1;

public class MainParcial1 {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Jose", "Lopez", "1234");

        ArmaCorta armacorta1 = new ArmaCorta(policia1, 100, 250, "RRST", 11, "EN USO", true);
        ArmaCorta armacorta2 = new ArmaCorta(policia1, 50, 200, "RRAA", 8, "EN USO", true);
        ArmaLarga armalarga1 = new ArmaLarga(policia1, 230, 280, "XXST", 18, "EN USO", true, "Defensa", 3);
        ArmaLarga armalarga2 = new ArmaLarga(policia1, 280, 210, "XXST2", 15, "EN USO", true, "Defensa", 5);

        System.out.println(armacorta1);
        System.out.println(armacorta2);
        System.out.println(armalarga1);
        System.out.println(armalarga2);
        System.out.println("Arma Larga es mayor?: ");
        System.out.println(armalarga1.compareTo(armalarga2));
    }
}
