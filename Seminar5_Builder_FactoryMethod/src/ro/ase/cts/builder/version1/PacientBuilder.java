package ro.ase.cts.builder.version1;

public class PacientBuilder implements AbstractBuilder {
    Pacient pacient;

    // Nu am setat explicit atributele de tip boolean ca fiind false,
    // deoarece acestea sunt setate implicit de catre JVM (cred) la rularea codului.
    public PacientBuilder(String nume) {
        this.pacient = new Pacient();
        this.pacient.setNume(nume);
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public Pacient getPacient() {
        return this.pacient;
    }
}
