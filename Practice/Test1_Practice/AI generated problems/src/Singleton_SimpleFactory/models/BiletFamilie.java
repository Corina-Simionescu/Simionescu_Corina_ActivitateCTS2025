package Singleton_SimpleFactory.models;

public class BiletFamilie implements Bilet {
    private int pret;

    public BiletFamilie(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "BiletFamilie{" +
                "pret=" + pret +
                '}';
    }
}
