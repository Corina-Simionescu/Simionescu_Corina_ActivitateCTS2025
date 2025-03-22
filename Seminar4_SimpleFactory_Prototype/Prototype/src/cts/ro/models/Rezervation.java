package cts.ro.models;

public abstract class Rezervation {
    private String name;
    private int hour;
    private int day;
    private int numberOfPeople;

    public Rezervation() {
    }

    public Rezervation(String name, int hour, int day, int numberOfPeople) {
        this.name = name;
        this.hour = hour;
        this.day = day;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public abstract Rezervation createCopy(int day);
}
