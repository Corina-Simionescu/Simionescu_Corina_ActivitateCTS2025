package ro.ase.cts.factorymethod.factories;

import ro.ase.cts.factorymethod.models.Angajat;
import ro.ase.cts.factorymethod.models.Asistent;
import ro.ase.cts.factorymethod.models.Medic;

public class FactoryPersonalMedical implements FactoryPersonal {
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        switch (tipPersonal) {
            case TipPersonalMedical.ASISTENT -> {
                return new Asistent(nume, salariu, this.spor);
            }
            case TipPersonalMedical.MEDIC -> {
                return new Medic(nume, salariu, this.spor);
            }
            default -> throw new IllegalStateException("Unexpected value: " + tipPersonal);
        }
    }
}
