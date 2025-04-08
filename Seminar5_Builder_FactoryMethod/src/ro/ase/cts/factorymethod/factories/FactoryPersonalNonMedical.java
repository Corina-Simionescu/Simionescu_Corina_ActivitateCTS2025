package ro.ase.cts.factorymethod.factories;

import ro.ase.cts.factorymethod.models.Angajat;
import ro.ase.cts.factorymethod.models.Portar;
import ro.ase.cts.factorymethod.models.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }


    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        switch (tipPersonal) {
            case TipPersonalNonMedical.PORTAR -> {
                return new Portar(nume, salariu, this.vechime);
            }
            case TipPersonalNonMedical.SECRETAR -> {
                return new Secretar(nume, salariu, this.vechime);
            }

            default -> throw new IllegalStateException("Unexpected value: " + tipPersonal);
        }
    }
}
