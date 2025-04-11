package A3.factorymethod.factories;

import A3.factorymethod.models.Angajat;

public interface PersonalFactory {
    Angajat creareAngajat(TipPersonal tipPersonal, String nume, int salariu, float spor);
}
