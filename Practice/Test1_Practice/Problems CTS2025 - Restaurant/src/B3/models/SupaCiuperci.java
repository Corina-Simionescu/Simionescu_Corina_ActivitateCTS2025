package B3.models;

public class SupaCiuperci extends Mancare {
    public SupaCiuperci(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "SupaCiuperci{" +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                "} " + super.toString();
    }
}
