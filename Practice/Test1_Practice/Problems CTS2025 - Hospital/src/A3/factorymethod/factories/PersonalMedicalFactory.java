package A3.factorymethod.factories;

import A3.factorymethod.models.Angajat;
import A3.factorymethod.models.Asistent;
import A3.factorymethod.models.Brancardier;
import A3.factorymethod.models.Medic;

public class PersonalMedicalFactory implements PersonalFactory {
    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, int salariu, float spor) {
        switch(tipPersonal) {
            case TipPersonalMedical.Medic -> {
                return new Medic(nume, salariu, spor);
            }
            case TipPersonalMedical.Asistent -> {
                return new Asistent(nume, salariu, spor);
            }
            case TipPersonalMedical.Brancardier -> {
                return new Brancardier(nume, salariu, spor);
            }
            default -> {
                System.out.println("Tipul introdus nu este corect");
                return null;
            }
        }
    }
}
