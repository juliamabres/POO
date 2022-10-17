package PatronState;

public class Feliz implements Estado{
    private Tamagotchi tamagotchi;

    public Feliz(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void bebe() {
        tamagotchi.setEstado(new Hambriento(tamagotchi));
    }

    @Override
    public void come() {
        tamagotchi.setEstado(new Sediento(tamagotchi));
    }

    @Override
    public void recibeMimos() {
        System.out.println("Sigo Feliz!");
    }

}
