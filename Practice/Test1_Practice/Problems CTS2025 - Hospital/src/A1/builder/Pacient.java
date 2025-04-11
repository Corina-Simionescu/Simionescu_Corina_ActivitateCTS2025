package A1.builder;

public class Pacient {
    // Daca vreau ca clasa Pacient sa fie imutabila, pun "final" la campuri.
    // Ex: private final boolean arePatRabatabil;
    // In prezent, clasa este imutabila din exterior, dar nu si din interior.
    // Adica odata setate, campurile nu mai pot fi modificate din exterior, dar pot fi modificate din interior.
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;

    // Pentru cerinta:  "In cazul in care pacientul nu alege aceste facilitați extra,
    // in cadrul aplicației sunt setate cu false", acest comportament este default.
    // Deci, nu este nevoie sa setez explicit campurile cu "false", deoarece acestea sunt setate implicit de catre JVM.

    private Pacient(PacientBuilder pacientBuilder) {
        this.nume = pacientBuilder.nume;
        this.arePatRabatabil = pacientBuilder.arePatRabatabil;
        this.areMicDejun = pacientBuilder.areMicDejun;
        this.arePapuci = pacientBuilder.arePapuci;
        this.areHalat = pacientBuilder.areHalat;
    }

    public String getNume() {
        return nume;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    public boolean isAreMicDejun() {
        return areMicDejun;
    }

    public boolean isArePapuci() {
        return arePapuci;
    }

    public boolean isAreHalat() {
        return areHalat;
    }

    public static PacientBuilder builder(String nume) {
        return new PacientBuilder(nume);
    }

//    Daca nu vreau sa am un camp setat neaparat.
//    In cazul asta trb sa am doar constructor fara parametri in PacientBuilder.
//    public static PacientBuilder builder() {
//        return new PacientBuilder();
//    }

    public static class PacientBuilder implements Builder {
        private String nume;
        private boolean arePatRabatabil;
        private boolean areMicDejun;
        private boolean arePapuci;
        private boolean areHalat;

        public PacientBuilder(String nume) {
            this.nume = nume;
        }

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
        public Pacient build() {
            return new Pacient(this);
        }
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
