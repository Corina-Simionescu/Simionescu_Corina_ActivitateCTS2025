package cts.ro.models;

public abstract class Soup {
    private int price;
    private int amount;
    private int cookingTime;
    private Boolean isSpicy;

    public Soup(int price, int amount, int cookingTime, Boolean isSpicy) {
        this.price = price;
        this.amount = amount;
        this.cookingTime = cookingTime;
        this.isSpicy = isSpicy;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void printDescription();

    public abstract float calculateFinalPrice();
}
