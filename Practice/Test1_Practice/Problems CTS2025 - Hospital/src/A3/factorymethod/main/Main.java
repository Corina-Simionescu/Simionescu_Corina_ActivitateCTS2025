package A3.factorymethod.main;

import A3.factorymethod.factories.PersonalMedicalFactory;
import A3.factorymethod.factories.PersonalNonMedicalFactory;
import A3.factorymethod.factories.TipPersonalMedical;
import A3.factorymethod.factories.TipPersonalNonMedical;
import A3.factorymethod.models.Angajat;

public class Main {
    public static void main(String[] args) {
        PersonalMedicalFactory personalMedicalFactory = new PersonalMedicalFactory();
        PersonalNonMedicalFactory personalNonMedicalFactory = new PersonalNonMedicalFactory();

        Angajat a1 = personalMedicalFactory.creareAngajat(TipPersonalMedical.Asistent, "ana", 3000, 10);
        System.out.println(a1.toString());
        Angajat a2 = personalMedicalFactory.creareAngajat(TipPersonalNonMedical.Secretar, "maria", 3000, 20);

        Angajat a3 = personalNonMedicalFactory.creareAngajat(TipPersonalNonMedical.Secretar, "ion", 1000, 1);
        System.out.println(a3.toString());
    }
}
