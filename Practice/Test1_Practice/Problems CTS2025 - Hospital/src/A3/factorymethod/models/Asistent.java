package A3.factorymethod.models;

public class Asistent extends Angajat {
    private float spor;

    public Asistent(String nume, int salariu, float spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return "Asistent{" +
                "spor=" + spor +
                "} " + super.toString();
    }
}
