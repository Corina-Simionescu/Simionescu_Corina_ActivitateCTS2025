package B3.factories;

import B3.models.Mancare;

public interface MancareFactory {
    Mancare creareMancare(TipMancare tipMancare, String nume, int pret);
}
