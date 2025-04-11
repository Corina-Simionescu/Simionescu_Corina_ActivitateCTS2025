package Singleton_SimpleFactory.main;

import Singleton_SimpleFactory.factory.BiletFactory;
import Singleton_SimpleFactory.factory.TipBilet;
import Singleton_SimpleFactory.models.Bilet;

public class Main {
    public static void main(String[] args) {
        BiletFactory biletFactory = BiletFactory.getInstance();
        BiletFactory biletFactory1 = BiletFactory.getInstance();

        System.out.println("Demonstrare ca Bilet Factory este singleton:");
        System.out.println("biletFactory == biletFactory1 -> " + (biletFactory == biletFactory1));

        System.out.println("Testare Bilet Factory:");
        Bilet b1 = biletFactory.creareBilet(TipBilet.Normal, 10);
        Bilet b2 = biletFactory.creareBilet(TipBilet.VIP, 100);

        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
