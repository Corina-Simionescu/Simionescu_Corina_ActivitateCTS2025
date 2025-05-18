package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - Restaurant -> B7\n");

        Nota nota =  new NotaDePlata(100);

        NotaDecorata notaDecorata = new NotaRevelion(nota);
        notaDecorata.printare();

        notaDecorata = new NotaPaste(nota);
        notaDecorata.printare();
    }
}
