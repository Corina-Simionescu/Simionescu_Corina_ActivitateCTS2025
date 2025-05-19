package ro.ase.cts.TemplateMethod.main;

import ro.ase.cts.TemplateMethod.clase.ATramvai;
import ro.ase.cts.TemplateMethod.clase.Tramvai;
import ro.ase.cts.TemplateMethod.clase.TramvaiTemporar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - STB -> F14\n");

        ATramvai tramvai1 = new Tramvai(1);
        tramvai1.parcurgeTur();
        tramvai1.parcurgeRetur();

        ATramvai tramvai2 = new TramvaiTemporar(2);
        tramvai2.parcurgeTur();
    }
}
