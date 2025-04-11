package A2.factorymethod.factories;

import A2.factorymethod.models.Angajat;

public interface AngajatFactory {
    Angajat creareAngajat(String nume, int salariu);
}
