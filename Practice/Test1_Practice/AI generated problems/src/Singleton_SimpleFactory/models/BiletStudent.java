package Singleton_SimpleFactory.models;

public class BiletStudent implements Bilet {
    private int pret;

    public BiletStudent(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "BiletStudent{" +
                "pret=" + pret +
                '}';
    }
}
