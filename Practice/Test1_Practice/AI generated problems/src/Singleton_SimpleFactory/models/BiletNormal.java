package Singleton_SimpleFactory.models;

public class BiletNormal implements Bilet {
    private int pret;

    public BiletNormal(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "BiletNormal{" +
                "pret=" + pret +
                '}';
    }
}
