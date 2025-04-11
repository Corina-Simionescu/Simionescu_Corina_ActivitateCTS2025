package A3.factorymethod.models;

public class Secretar extends Angajat {
    private float spor;

    public Secretar(String nume, int salariu, float spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return "Secretar{" +
                "spor=" + spor +
                "} " + super.toString();
    }
}
