package Singleton_SimpleFactory.models;

public class BiletVIP implements Bilet{
    private int pret;

    public BiletVIP(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "BiletVIP{" +
                "pret=" + pret +
                '}';
    }
}
