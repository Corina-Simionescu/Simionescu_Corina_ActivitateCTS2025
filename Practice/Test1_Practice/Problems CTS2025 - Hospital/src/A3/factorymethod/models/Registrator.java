package A3.factorymethod.models;

public class Registrator extends Angajat {
    private float spor;

    public Registrator(String nume, int salariu, float spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return "Registrator{" +
                "spor=" + spor +
                "} " + super.toString();
    }
}
