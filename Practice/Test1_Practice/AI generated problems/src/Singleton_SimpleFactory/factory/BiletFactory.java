package Singleton_SimpleFactory.factory;

import Singleton_SimpleFactory.models.*;

public class BiletFactory {
    private static BiletFactory instance = new BiletFactory();

    private BiletFactory() {
    }

    public static BiletFactory getInstance() {
        return instance;
    }

    public Bilet creareBilet(TipBilet tipBilet, int pret) {
        switch (tipBilet) {
            case TipBilet.Normal -> {
                return new BiletNormal(pret);
            }
            case TipBilet.VIP -> {
                return new BiletVIP(pret);
            }
            case TipBilet.Student -> {
                return new BiletStudent(pret);
            }
            case TipBilet.Familie -> {
                return new BiletFamilie(pret);
            }
            default -> {
                System.out.println("Tipul de bilet introdus nu exista");
                return null;
            }
        }
    }
}
