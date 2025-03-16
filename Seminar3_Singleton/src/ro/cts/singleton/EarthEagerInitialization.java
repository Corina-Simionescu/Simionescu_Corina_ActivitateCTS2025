package ro.cts.singleton;

public class EarthEagerInitialization {
    private static final EarthEagerInitialization instance = new EarthEagerInitialization();

    private long population;
    private long ageInYears;
    private int numberOfContinents;

    private EarthEagerInitialization() {
        this.population = 8000000000L;
        this.ageInYears = 4540000000L;
        this.numberOfContinents = 7;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(long ageInYears) {
        this.ageInYears = ageInYears;
    }

    public int getNumberOfContinents() {
        return numberOfContinents;
    }

    public void setNumberOfContinents(int numberOfContinents) {
        this.numberOfContinents = numberOfContinents;
    }

    public static EarthEagerInitialization getInstance() {
        return instance;
    }
}
