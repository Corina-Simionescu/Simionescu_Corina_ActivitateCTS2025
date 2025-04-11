package A2.factorymethod.factories;

import A2.factorymethod.models.Angajat;
import A2.factorymethod.models.Brancardier;

public class BrancardierFactory implements AngajatFactory {

    @Override
    public Angajat creareAngajat(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
