package com.camada2.clase6;

import com.camada2.clase5Mesa.UsuarioJuego;

import java.time.LocalDate;

public class Main6 {
    public static void main(String[] args) {
        Impresora impresora1 = new Impresora("Y130", "usb", LocalDate.now(), 10);

                impresora1.tienePapel();
                impresora1.imprimir("Hola, yo soy el texto");

    }
}
