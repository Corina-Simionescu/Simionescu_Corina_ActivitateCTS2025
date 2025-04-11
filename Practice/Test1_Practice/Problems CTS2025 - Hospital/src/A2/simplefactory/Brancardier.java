package A2.simplefactory;

public class Brancardier implements Angajat {
    private String nume;
    private int salariu;

    public Brancardier(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Brancardier{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
