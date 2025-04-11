package B3.models;

public class SupaLegume extends Mancare {
    public SupaLegume(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "SupaLegume{" +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                "} " + super.toString();
    }
}
