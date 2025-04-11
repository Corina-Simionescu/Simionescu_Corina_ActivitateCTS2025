package B3.models;

public class Papanasi extends Mancare {
    public Papanasi(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Papanasi{" +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                "} " + super.toString();
    }
}
