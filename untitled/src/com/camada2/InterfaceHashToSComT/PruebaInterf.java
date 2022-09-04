package com.camada2.InterfaceHashToSComT;

public class PruebaInterf {
    public static void main(String[] args) {
            Mujer mujer1 = new Mujer("Julia", 100, 50, 34, 2);
            Mujer mujer2 = new Mujer("Luisa", 100, 50, 36, 0);

        System.out.println(mujer1.toString());
        System.out.println(mujer1.hashCode());
        System.out.println(mujer1.equals(mujer2));
    }
}
