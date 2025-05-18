package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Autobuz;
import ro.ase.cts.observer.clase.Calator;
import ro.ase.cts.observer.clase.MijlocTransport;
import ro.ase.cts.observer.clase.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - STB -> F11\n");

        Observer calator1 = new Calator("calator1");
        Observer calator2 = new Calator("calator2");
        Observer calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz) autobuz).schimbaTraseul();
    }
}
