package com.camada2.clase5;

public class Main5 {
    //psvm y enter
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Julia Mabres");
        cliente1.setDeuda(1000.);

        cliente1.incrementarDeuda(6000.);
        cliente1.pagarDeuda();
        cliente1.pagarDeuda(5000.);
    }
}
