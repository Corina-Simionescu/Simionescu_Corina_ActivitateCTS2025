package cts.ro.models;

public class VegetableSoup extends Soup {
    private static float discount = 0.1f;

    public VegetableSoup(int price, int amount, int cookingTime, Boolean isSpicy) {
        super(price, amount, cookingTime, isSpicy);
    }

    @Override
    public void printDescription() {
        System.out.println("Vegetable soup has " + super.getAmount() + " grams.");
    }

    @Override
    public float calculateFinalPrice() {
        return super.getPrice() - super.getPrice() * discount;
    }
}
