package SimpleFactory_Prototype.prototipes;

public class Dulap implements Mobilier {
    private String culoare;
    private double greutate;

    public Dulap() {
        this.culoare = "";
        this.greutate = 0;
    }

    public Dulap(String culoare, double greutate) {
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
        Dulap clona = new Dulap();
        clona.culoare = this.culoare;
        clona.greutate = this.greutate;
        return clona;
    }

    @Override
    public String toString() {
        return "Dulap{" +
                "culoare='" + culoare + '\'' +
                ", greutate=" + greutate +
                '}';
    }
}
