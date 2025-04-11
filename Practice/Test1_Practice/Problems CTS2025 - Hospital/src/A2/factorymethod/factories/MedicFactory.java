package A2.factorymethod.factories;

import A2.factorymethod.models.Angajat;
import A2.factorymethod.models.Medic;

public class MedicFactory implements AngajatFactory {
    @Override
    public Angajat creareAngajat(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
