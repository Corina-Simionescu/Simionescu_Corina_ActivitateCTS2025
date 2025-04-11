package B3.factories;

import B3.models.CheeseCake;
import B3.models.Clatite;
import B3.models.Mancare;
import B3.models.Papanasi;

public class DesertFactory implements MancareFactory {
    @Override
    public Mancare creareMancare(TipMancare tipMancare, String nume, int pret) {
        switch (tipMancare) {
            case TipDesert.PAPANASI -> {
                return new Papanasi(nume, pret);
            }
            case TipDesert.CLATITE -> {
                return new Clatite(nume, pret);
            }
            case TipDesert.CHEESE_CAKE -> {
                return new CheeseCake(nume, pret);
            }
            default -> {
                System.out.println("Tip de desert inexistent");
                try {
                    throw new Exception("Tip de desert inexistent");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
