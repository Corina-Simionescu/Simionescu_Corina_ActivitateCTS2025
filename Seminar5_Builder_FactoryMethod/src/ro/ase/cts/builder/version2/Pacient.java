package ro.ase.cts.builder.version2;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;

    protected Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuci, boolean areHalat) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuci=" + arePapuci +
                ", areHalat=" + areHalat +
                '}';
    }
}
