package com.company.practicaparcial1Embarcaciones;

public class MainEmbarcacion {
    public static void main(String[] args) {
              Capitan capitan1 = new Capitan("Luis", "Ramirez", "1235");
             Capitan capitan2 = new Capitan("Sergio", "Mabres", "1234");
             Capitan capitan3 = new Capitan("Raul", "Quinquela", "1236");

              Velero Velero1 = new Velero(1000., 500, 2020, 50., capitan1, 5);
              Yate Yate1 = new Yate(10000.,9000., 2019, 150., capitan2, 25);
        Yate Yate2 = new Yate(8000.,3000., 2021, 200., capitan3, 10);

        System.out.println(Velero1.toString());
        System.out.println("-----");
        System.out.println(Yate1.toString());
        System.out.println("-----");
        System.out.println(Yate2.toString());
        System.out.println("-----");
        System.out.println(Velero1.veleroGrande());
        System.out.println("-----");
        System.out.println(Yate1.compareTo(Yate2));

    }
}
