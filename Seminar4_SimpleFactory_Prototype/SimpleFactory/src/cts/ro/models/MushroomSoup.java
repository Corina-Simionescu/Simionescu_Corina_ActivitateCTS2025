package cts.ro.models;

public class MushroomSoup extends Soup {
    private static float discount = 0.2f;

    public MushroomSoup(int price, int amount, int cookingTime, Boolean isSpicy) {
        super(price, amount, cookingTime, isSpicy);
    }

    @Override
    public void printDescription() {
        System.out.println("Mushroom soup has " + super.getAmount() + " grams.");
    }

    @Override
    public float calculateFinalPrice() {
        return super.getPrice() - super.getPrice() * discount;
    }
}
