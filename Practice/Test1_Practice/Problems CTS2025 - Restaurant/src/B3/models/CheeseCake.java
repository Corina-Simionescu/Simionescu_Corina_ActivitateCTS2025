package B3.models;

public class CheeseCake extends Mancare {
    public CheeseCake(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "CheeseCake{" +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                "} " + super.toString();
    }
}
