package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.IRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;
import ro.ase.cts.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - Restaurant -> B9\n");

        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new ProxyRezervare(rezervare);
        proxy.realizeazaRezervare("ana", 3);
        proxy.realizeazaRezervare("maria", 5);
    }
}
