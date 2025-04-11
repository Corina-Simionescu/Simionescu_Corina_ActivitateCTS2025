package A3.factorymethod.factories;

import A3.factorymethod.models.Angajat;
import A3.factorymethod.models.Registrator;
import A3.factorymethod.models.Secretar;

public class PersonalNonMedicalFactory implements PersonalFactory {
    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, int salariu, float spor) {
        switch (tipPersonal) {
            case TipPersonalNonMedical.Secretar -> {
                return new Secretar(nume, salariu, spor);
            }
            case TipPersonalNonMedical.Registrator -> {
                return new Registrator(nume, salariu, spor);
            }
            default -> {
                System.out.println("Tipul introdus nu este corect");
                return null;
            }
        }
    }
}
