package com.camada2.clase18mesaprofe;

public class Main {
    public static void main(String[] args) {

        //Creamos un objeto del tipo Empresa
        Empresa empresa = new Empresa();


        //Creamos dos reservas
        Reserva r1 = new Reserva("RX3242", 2, "Buenos Aires", "Mercedes");
        Reserva r2 = new Reserva("RX3243", 5, "Buenos Aires", "Bragado");

        //Agregamos las reservas a la empresa
        empresa.agregarReserva(r1);
        empresa.agregarReserva(r2);

        //calculamos el valor total por reserva
        System.out.println("$" + r1.calcularTotalReserva());
        System.out.println("$" + r2.calcularTotalReserva());

        //Invocaci�n de los dos m�todos solicitados
        System.out.println("Recaudaci�n Total: " + empresa.recaudacionTotal());
        System.out.println("------------------------------------------------");
        System.out.println("Cantidad de personas que pasaron por BUENOS AIRES acaaaaaaaa: ");
        try{
            empresa.cantVecesRecorrida("Buenos Aires");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        };

        System.out.println("Cantidad de personas que pasaron por CORDOBA acaaaaaaa: ");
        try{
            empresa.cantVecesRecorrida("CORDOBA");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        };

        System.out.println("----- Streams -----");
        System.out.println("Recaudaci�n Total: " + empresa.recaudacion());

        System.out.println("Cantidad de personas que pasaron por BUENOS AIRES:");
        try {
            System.out.println(empresa.cantVeces("Buenos Aires"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Cantidad de personas que pasaron por LA PLATA:");
        try {
            System.out.println(empresa.cantVeces("La Plata"));
        } catch (Exception e){
            System.err.println(e.getMessage());//al poner .err lo imprime en rojo
        }

    }
}
