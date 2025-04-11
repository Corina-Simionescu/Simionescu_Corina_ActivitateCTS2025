package B2.main;

import B2.builder.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare c1 = Rezervare.builder("ana").setAreAsezareLaGeam(true).setAreMasaDecorata(true).build();
        System.out.println(c1.toString());

        Rezervare c2 = Rezervare.builder("andreea").setAreMuzicaAmbientala(true).setGenMuzica("rock").build();
        System.out.println(c2.toString());
    }
}
