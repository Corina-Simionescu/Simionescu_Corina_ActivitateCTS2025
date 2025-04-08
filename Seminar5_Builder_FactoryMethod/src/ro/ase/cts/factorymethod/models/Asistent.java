package ro.ase.cts.factorymethod.models;

public class Asistent extends Angajat{
    public double spor;

    public Asistent(String nume, double salariu, double spor) {
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
