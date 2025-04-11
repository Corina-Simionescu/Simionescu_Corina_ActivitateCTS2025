package B1.models;

import java.util.List;

public class SupaLegume extends Supa {
    private int pret;

    public SupaLegume(String nume, List<String> ingrediente, int pret) {
        super(nume, ingrediente);
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "SupaLegume{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                ", ingrediente=" + ingrediente +
                "} " + super.toString();
    }
}
