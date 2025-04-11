package B2.builder;

public class Rezervare {
    private String nume;
    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    private Rezervare(ClientBuilder clientBuilder) {
        this.nume = clientBuilder.nume;
        this.areAsezareLaGeam = clientBuilder.areAsezareLaGeam;
        this.areScauneErgonomice = clientBuilder.areScauneErgonomice;
        this.areMasaDecorata = clientBuilder.areMasaDecorata;
        this.areMuzicaAmbientala = clientBuilder.areMuzicaAmbientala;
        this.genMuzica = clientBuilder.genMuzica;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsezareLaGeam() {
        return areAsezareLaGeam;
    }

    public boolean isAreScauneErgonomice() {
        return areScauneErgonomice;
    }

    public boolean isAreMasaDecorata() {
        return areMasaDecorata;
    }

    public boolean isAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public static ClientBuilder builder(String nume) {
        return new ClientBuilder(nume);
    }

    public static class ClientBuilder implements Builder {
        private String nume;
        private boolean areAsezareLaGeam;
        private boolean areScauneErgonomice;
        private boolean areMasaDecorata;
        private boolean areMuzicaAmbientala;
        private String genMuzica = "";

        public ClientBuilder(String nume) {
            this.nume = nume;
        }

        public ClientBuilder setAreAsezareLaGeam(boolean areAsezareLaGeam) {
            this.areAsezareLaGeam = areAsezareLaGeam;
            return this;
        }

        public ClientBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
            this.areScauneErgonomice = areScauneErgonomice;
            return this;
        }

        public ClientBuilder setAreMasaDecorata(boolean areMasaDecorata) {
            this.areMasaDecorata = areMasaDecorata;
            return this;
        }

        public ClientBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
            this.areMuzicaAmbientala = areMuzicaAmbientala;
            return this;
        }

        public ClientBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", areAsezareLaGeam=" + areAsezareLaGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areMasaDecorata=" + areMasaDecorata +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
