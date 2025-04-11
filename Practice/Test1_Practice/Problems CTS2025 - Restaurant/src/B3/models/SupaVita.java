package B3.models;

public class SupaVita extends Mancare {
    public SupaVita(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "SupaVita{" +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                "} " + super.toString();
    }
}
