package B3.models;

public class Clatite extends Mancare {
    public Clatite(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Clatite{" +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                "} " + super.toString();
    }
}
