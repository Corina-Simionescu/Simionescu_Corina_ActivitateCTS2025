package ro.ase.cts.flyweight.clase;

public class Spitalizare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Spitalizare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Spitalizare{" +
                "numarSalon=" + numarSalon +
                ", numarPat=" + numarPat +
                ", numarZileSpitalizare=" + numarZileSpitalizare +
                '}';
    }
}
