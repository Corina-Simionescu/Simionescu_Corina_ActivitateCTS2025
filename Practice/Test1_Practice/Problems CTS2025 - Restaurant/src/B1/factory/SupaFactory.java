package B1.factory;

import B1.models.Supa;
import B1.models.SupaCiuperci;
import B1.models.SupaLegume;
import B1.models.SupaVita;

import java.util.List;

public class SupaFactory implements Factory {
    @Override
    public Supa creareSupa(TipSupa tipSupa, String nume, List<String> ingrediente, int pret) {
        switch (tipSupa) {
            case TipSupa.CIUPERCI -> {
                return new SupaCiuperci(nume, ingrediente, pret);
            }
            case TipSupa.VITA -> {
                return new SupaVita(nume, ingrediente, pret);
            }
            case TipSupa.LEGUME -> {
                return new SupaLegume(nume, ingrediente, pret);
            }
            default -> {
                System.out.println("Tipul de supa introdus este gresit");
                try {
                    throw new Exception("Tip supa gresit");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
