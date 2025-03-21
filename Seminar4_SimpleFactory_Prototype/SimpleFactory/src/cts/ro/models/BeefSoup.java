package cts.ro.models;

public class BeefSoup extends Soup {
    private static float discount = 0.5f;

    public BeefSoup(int price, int amount, int cookingTime, Boolean isSpicy) {
        super(price, amount, cookingTime, isSpicy);
    }

    @Override
    public void printDescription() {
        System.out.println("Beef soup has " + super.getAmount() + " grams.");
    }

    @Override
    public float calculateFinalPrice() {
        return super.getPrice() - super.getPrice() * discount;
    }
}
