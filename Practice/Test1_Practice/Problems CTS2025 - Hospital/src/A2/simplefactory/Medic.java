package A2.simplefactory;

public class Medic implements Angajat {
    private String nume;
    private int salariu;

    public Medic(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
