package SimpleFactory_Prototype.prototipes;

public class Scaun implements Mobilier {
    private String culoare;
    private double greutate;

    public Scaun() {
        this.culoare = "";
        this.greutate = 0;
    }

    public Scaun(String culoare, double greutate) {
        this.culoare = culoare;
        this.greutate = greutate;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    @Override
    public Mobilier clone() {
        Scaun clona = new Scaun();
        clona.culoare = this.culoare;
        clona.greutate = this.greutate;
        return clona;
    }

    @Override
    public String toString() {
        return "Scaun{" +
                "culoare='" + culoare + '\'' +
                ", greutate=" + greutate +
                '}';
    }
}
