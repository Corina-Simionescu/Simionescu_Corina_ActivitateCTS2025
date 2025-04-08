package ro.ase.cts.factorymethod.models;

public class Medic extends Angajat {
    public double spor;

    public Medic(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
