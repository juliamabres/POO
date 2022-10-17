package PatronState;

public class Hambriento implements Estado{
    private Tamagotchi tamagotchi;

    public Hambriento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void bebe() {
        tamagotchi.setEstado(new Triste(tamagotchi));
    }

    @Override
    public void come() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
    }

    @Override
    public void recibeMimos() {
        System.out.println("Sigo Hambriento");
    }
}
