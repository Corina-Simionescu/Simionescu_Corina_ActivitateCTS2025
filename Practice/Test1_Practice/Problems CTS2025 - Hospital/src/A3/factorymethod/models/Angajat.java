package A3.factorymethod.models;

public abstract class Angajat {
    private String nume;
    private int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
