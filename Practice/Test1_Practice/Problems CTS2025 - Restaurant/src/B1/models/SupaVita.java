package B1.models;

import java.util.List;

public class SupaVita extends Supa {
    private int pret;

    public SupaVita(String nume, List<String> ingrediente, int pret) {
        super(nume, ingrediente);
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "SupaVita{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                ", ingrediente=" + ingrediente +
                "} " + super.toString();
    }
}
