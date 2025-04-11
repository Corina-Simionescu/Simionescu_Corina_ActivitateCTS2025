package A2.main;

import A2.simplefactory.*;

public class MainSimpleFactory {
    public static void main(String[] args) {
        System.out.println("--------------- SIMPLE FACTORY ---------------");
        AngajatFactory angajatFactory = new AngajatFactory();

        try {
            Angajat asistent = angajatFactory.creareAngajat(TipAngajat.Asistent, "ana", 5000);
            System.out.println(asistent.toString());
            Angajat medic = angajatFactory.creareAngajat(TipAngajat.valueOf("aaa"), "ionel", 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
