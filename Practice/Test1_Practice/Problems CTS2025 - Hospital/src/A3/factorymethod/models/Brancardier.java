package A3.factorymethod.models;

public class Brancardier extends Angajat {
    private float spor;

    public Brancardier(String nume, int salariu, float spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return "Brancardier{" +
                "spor=" + spor +
                "} " + super.toString();
    }
}
