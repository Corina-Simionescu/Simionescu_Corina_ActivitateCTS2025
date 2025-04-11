package A3.factorymethod.models;

public class Medic extends Angajat {
    private float spor;

    public Medic(String nume, int salariu, float spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "spor=" + spor +
                "} " + super.toString();
    }
}
