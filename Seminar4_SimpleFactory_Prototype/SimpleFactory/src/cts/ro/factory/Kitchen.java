package cts.ro.factory;

import cts.ro.models.BeefSoup;
import cts.ro.models.MushroomSoup;
import cts.ro.models.Soup;
import cts.ro.models.VegetableSoup;

public class Kitchen {
    public static Soup createSoup(SoupType type, int price, int amount, int cookingTime, Boolean isSpicy) {
        switch (type) {
            case VEGETABLE -> {
                return new VegetableSoup(price, amount, cookingTime, isSpicy);
            }
            case MUSHROOMS -> {
                return new MushroomSoup(price, amount, cookingTime, isSpicy);
            }
            case BEEF -> {
                return new BeefSoup(price, amount, cookingTime, isSpicy);
            }
            default -> {
                return null;
            }
        }
    }
}
