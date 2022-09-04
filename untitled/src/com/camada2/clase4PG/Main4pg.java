package com.camada2.clase4PG;

public class Main4pg {

    public static void main(String[] args) {
        Objeto objeto;

        objeto = new Objeto(2, "Julia", "mabres", 300.50, 20);

        System.out.println("este es el precio: " + objeto.consultarPrecio());
        System.out.println("este es el stock: " + objeto.hayStock());

        //objeto = new Objeto(5, "Luis", "Perez", 400.5, 90);
        //System.out.println("el alumno 5 es el id: " + alu5.getId());
        //System.out.println("el alumno 6 es el id: " + alu6.getId());
        //System.out.println("---------------------");

        //seteo alu5, cambio el valor
        //  alu5.setId(1);
        //        alu5.setApellido("Martinez");
        //        alu5.setNombre("Maria");
        //        System.out.println("el alumno 5 es el id: " + alu5.getId());

    }
    }

