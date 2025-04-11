package A2.factorymethod.factories;

import A2.factorymethod.models.Angajat;
import A2.factorymethod.models.Asistent;

public class AsistentFactory implements AngajatFactory {
    @Override
    public Angajat creareAngajat(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
