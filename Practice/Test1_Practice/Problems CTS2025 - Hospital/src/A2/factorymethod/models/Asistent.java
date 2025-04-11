package A2.factorymethod.models;

public class Asistent implements Angajat {
    private String nume;
    private int salariu;

    public Asistent(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Asistent{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
