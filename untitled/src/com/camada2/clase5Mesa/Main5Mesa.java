package com.camada2.clase5Mesa;

public class Main5Mesa {

    public static void main(String[] args) {

        UsuarioJuego usuarioJuego1 = new UsuarioJuego("julia", "sofi", 0., 0);

        usuarioJuego1.aumentarPuntaje();
        usuarioJuego1.subirNivel();
        usuarioJuego1.bonus(2);

    }
}
