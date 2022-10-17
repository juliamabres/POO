package com.camada2.clase26.clase;

public class Main {
    public static void main(String[] args) {
        Usuario us1 = new Usuario("Vivi", "Benitez");
        Seguidor seg1 = new Seguidor("Gonza", "Gollo", 20);
        Seguidor seg2 = new Seguidor("Clari", "ALfieri", 30);
        Seguidor seg3 = new Seguidor("Leo", "Barrera", 6);

        System.out.println("----Agregar seguidores----");
        us1.agregarObservador(seg1);
        us1.agregarObservador(seg2);
        us1.agregarObservador(seg3);
        System.out.println("----Subir foto y notificar----");
        us1.subirFoto();
        System.out.println("----Eliminar Seguidor----");
        us1.eliminarObservador(seg2);

    }
}
