package ro.ase.cts.ChainOfResponsability.main;

import ro.ase.cts.ChainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - STB -> F12\n");

        Handler troleibuz = new RecomandaTroleibuz();
        Handler autobuz = new RecomandaAutobuz();
        Handler tramvai = new RecomandaTramvai();
        Handler metrou = new RecomandaMetrou();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);

        troleibuz.recomandaMijlocTransport(2);
        troleibuz.recomandaMijlocTransport(4);
        troleibuz.recomandaMijlocTransport(8);
        troleibuz.recomandaMijlocTransport(12);
    }
}
