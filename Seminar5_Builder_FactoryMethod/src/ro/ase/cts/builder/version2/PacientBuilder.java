package ro.ase.cts.builder.version2;

public class PacientBuilder implements AbstractBuilder {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;

    public PacientBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public Pacient getPacient() {
        Pacient pacient = new Pacient(this.nume, this.arePatRabatabil, this.areMicDejun,
                                      this.arePapuci, this.areHalat);
        return pacient;
    }
}
