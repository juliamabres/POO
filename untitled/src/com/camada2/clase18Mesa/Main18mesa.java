package com.camada2.clase18Mesa;


public class Main18mesa {
    public static void main(String[] args) {
        //creacion objeto tipo empresa
        Empresa empresa = new Empresa();

        //crear 2 reservas
        Reserva r1 = new Reserva("RX3242", 2, "Buenos Aires", "Mercedes");
        Reserva r2 = new Reserva("RX3243", 5, "Buenos Aires", "Bragado");

        //Agregamos las reservas a la empresa
        empresa.agregarReserva(r1);
        empresa.agregarReserva(r2);

        //calculamos el valor total por reserva
        System.out.println("El valor total de la reserva 1 es: $" + r1.calcularTotalReserva());
        System.out.println("El valor total de la reserva 1 es: $" + r2.calcularTotalReserva());
        //recaudacion total
        System.out.println("La recaudacion total de la empresa es de $" + empresa.recaudacionTotal());
        // try y catch
        System.out.println("Cantidad de personas que pasaron por BUENOS AIRES: ");
        try {
            empresa.cantVecesRecorrida("Buenos Aires");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Cantidad de personas que pasaron por CORDOBA: ");
        try {
            empresa.cantVecesRecorrida("CORDOBA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




