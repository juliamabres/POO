package PatronState;

public class Triste implements Estado{
    private Tamagotchi tamagotchi;

    public Triste(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep...display titilando...");
    }

    @Override
    public void come() {
        System.out.println("Beep, beep... vomitando");
    }

    @Override
    public void recibeMimos() {
        tamagotchi.setEstado(new Feliz(tamagotchi));

    }
}
