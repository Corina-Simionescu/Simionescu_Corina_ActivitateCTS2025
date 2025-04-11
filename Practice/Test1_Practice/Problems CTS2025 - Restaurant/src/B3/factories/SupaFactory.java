package B3.factories;

import B3.models.Mancare;
import B3.models.SupaCiuperci;
import B3.models.SupaLegume;
import B3.models.SupaVita;

public class SupaFactory implements MancareFactory {
    @Override
    public Mancare creareMancare(TipMancare tipMancare, String nume, int pret) {
        switch (tipMancare) {
            case TipSupa.CIUPERCI -> {
                return new SupaCiuperci(nume, pret);
            }
            case TipSupa.LEGUME -> {
                return new SupaLegume(nume, pret);
            }
            case TipSupa.VITA -> {
                return new SupaVita(nume, pret);
            }
            default -> {
                System.out.println("Tip de supa inexistent");
                return null;
            }
        }
    }
}
