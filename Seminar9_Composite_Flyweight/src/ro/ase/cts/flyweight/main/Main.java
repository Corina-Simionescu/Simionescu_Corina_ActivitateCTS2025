package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Receptie;
import ro.ase.cts.flyweight.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - Hospital -> A10\n");

        Receptie receptie = new Receptie();

        receptie.getPacient("1234567890123", "ana", "strada 1", "1234567890");
        receptie.getPacient("1234567890321", "ion", "strada 2", "1234567891");
        receptie.getPacient("1234567890111", "maria", "strada 3", "1234567892");

        Spitalizare spitalizare1 = new Spitalizare(1, 1, 1);
        Spitalizare spitalizare2 = new Spitalizare(2, 2, 2);
        Spitalizare spitalizare3 = new Spitalizare(3, 3, 3);

        try {
            receptie.getPacient("1234567890123").detaliiPacient(spitalizare1);
            receptie.getPacient("1234567890321").detaliiPacient(spitalizare2);
            receptie.getPacient("1234567890111").detaliiPacient(spitalizare3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
