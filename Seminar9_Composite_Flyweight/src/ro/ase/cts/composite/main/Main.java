package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Solved problem: Problems CTS2025 - Hospital -> A8\n");

            Structura sectie1 = new Sectie("sectia 1", 10);
            Structura sectie2 = new Sectie("sectia 2", 5);
            Structura sectie3 = new Sectie("sectia 3", 30);

            Structura departament = new Departament("departament 1");
            departament.adaugaNod(sectie1);
            departament.adaugaNod(sectie2);
            departament.descriereStructura();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
