package Singleton_Builder;

public class Joc {
    private String rezolutie;
    private String calitateGrafica;
    private int nivelDificultate;
    private int volum;
    private boolean controlParental;

    private Joc(ConfiguratorJoc configuratorJoc) {
        this.rezolutie = configuratorJoc.rezolutie;
        this.calitateGrafica = configuratorJoc.calitateGrafica;
        this.volum = configuratorJoc.volum;
        this.nivelDificultate = configuratorJoc.nivelDificultate;
        this.controlParental = configuratorJoc.controlParental;
    }

    public String getRezolutie() {
        return rezolutie;
    }

    public String getCalitateGrafica() {
        return calitateGrafica;
    }

    public int getNivelDificultate() {
        return nivelDificultate;
    }

    public int getVolum() {
        return volum;
    }

    public boolean isControlParental() {
        return controlParental;
    }

    public static ConfiguratorJoc builder() {
        return ConfiguratorJoc.getInstance();
    }

    public static class ConfiguratorJoc {
        private static ConfiguratorJoc instance = new ConfiguratorJoc();

        private String rezolutie = "";
        private String calitateGrafica = "";
        private int nivelDificultate = 0;
        private int volum = 0;
        private boolean controlParental = false;

        private ConfiguratorJoc() {
        }

        public static ConfiguratorJoc getInstance() {
            return instance;
        }

        public ConfiguratorJoc setRezolutie(String rezolutie) {
            this.rezolutie = rezolutie;
            return this;
        }

        public ConfiguratorJoc setCalitateGrafica(String calitateGrafica) {
            this.calitateGrafica = calitateGrafica;
            return this;
        }

        public ConfiguratorJoc setNivelDificultate(int nivelDificultate) {
            this.nivelDificultate = nivelDificultate;
            return this;
        }

        public ConfiguratorJoc setVolum(int volum) {
            this.volum = volum;
            return this;
        }

        public ConfiguratorJoc setControlParental(boolean controlParental) {
            this.controlParental = controlParental;
            return this;
        }

        public Joc build() {
            return new Joc(this);
        }
    }

    @Override
    public String toString() {
        return "Joc{" +
                "rezolutie='" + rezolutie + '\'' +
                ", calitateGrafica='" + calitateGrafica + '\'' +
                ", nivelDificultate=" + nivelDificultate +
                ", volum=" + volum +
                ", controlParental=" + controlParental +
                '}';
    }
}
