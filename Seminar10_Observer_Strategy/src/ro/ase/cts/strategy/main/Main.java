package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.Calator;
import ro.ase.cts.strategy.clase.CardCalatorie;
import ro.ase.cts.strategy.clase.IMetodaPlata;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - STB -> F10\n");

        Calator calator1 = new Calator("ana");
        calator1.platesteCalatorie(3);
        calator1.platesteCalatorie(10);

        IMetodaPlata cardCalatorie = new CardCalatorie(10);
        Calator calator2 = new Calator("ion", cardCalatorie);
        calator2.platesteCalatorie(11);
    }
}
