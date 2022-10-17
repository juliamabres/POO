package PatronState;

public class mainTamagotchi {
    public static void main(String[] args) {
        //comienza triste
        Tamagotchi t = new Tamagotchi();
        t.bebe(); //sigue triste
        t.recibeMimos(); // pasa a feliz
        t.come(); //sediento
        t.bebe(); //feliz
        t.recibeMimos(); //sigue feliz

    }
}
