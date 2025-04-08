package ro.ase.cts.factorymethod.factories;

import ro.ase.cts.factorymethod.models.Angajat;

public interface FactoryPersonal {
    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
