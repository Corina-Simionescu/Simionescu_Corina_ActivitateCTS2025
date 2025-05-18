package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - Restaurant -> B6\n");

        Facade facade = new Facade();
        Masa masa1 = new Masa(5, true);
        Masa masa2 = new Masa(10, true);

        System.out.println(facade.sePoateLuaLocLaMasa(masa1));
        System.out.println(facade.sePoateLuaLocLaMasa(masa2));
    }
}
