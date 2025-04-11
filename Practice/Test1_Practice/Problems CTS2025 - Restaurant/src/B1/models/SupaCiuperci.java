package B1.models;

import java.util.List;

public class SupaCiuperci extends Supa {
    private int pret;

    public SupaCiuperci(String nume, List<String> ingrediente, int pret) {
        super(nume, ingrediente);
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "SupaCiuperci{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                ", ingrediente=" + ingrediente +
                "} " + super.toString();
    }
}
