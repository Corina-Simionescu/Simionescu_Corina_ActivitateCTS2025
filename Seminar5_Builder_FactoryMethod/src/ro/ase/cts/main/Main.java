package ro.ase.cts.main;

import ro.ase.cts.builder.version1.Pacient;
import ro.ase.cts.builder.version1.PacientBuilder;
import ro.ase.cts.factorymethod.factories.FactoryPersonalMedical;
import ro.ase.cts.factorymethod.factories.FactoryPersonalNonMedical;
import ro.ase.cts.factorymethod.factories.TipPersonalMedical;
import ro.ase.cts.factorymethod.factories.TipPersonalNonMedical;
import ro.ase.cts.factorymethod.models.Angajat;
import ro.ase.cts.factorymethod.models.Asistent;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test builder version 1:");
        Pacient p1 = new PacientBuilder("ana").getPacient();
        System.out.println(p1.toString());

        Pacient p2 = new PacientBuilder("ion").setArePatRabatabil(true).setAreMicDejun(true).getPacient();
        System.out.println(p2.toString());

        System.out.println("Test builder version 2:");
        ro.ase.cts.builder.version2.Pacient p3 = new ro.ase.cts.builder.version2.PacientBuilder().getPacient();
        System.out.println(p3.toString());

        ro.ase.cts.builder.version2.Pacient p4 = new ro.ase.cts.builder.version2.PacientBuilder().setNume("vasile").setArePapuci(true).setArePatRabatabil(true).setAreHalat(true).getPacient();
        System.out.println(p4.toString());

        System.out.println("Test factory method:");
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10);
        Angajat asistent = factoryPersonalMedical.creareAngajat(TipPersonalMedical.ASISTENT, "ana", 7000);
        System.out.println("Asistent: " + asistent.toString());

        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(5);
        Angajat portar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.PORTAR, "vasile", 3000);
        System.out.println(portar.toString());


    }
}
