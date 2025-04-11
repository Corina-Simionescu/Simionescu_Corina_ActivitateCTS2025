package SimpleFactory_Prototype.prototipes;

public class Masa implements Mobilier {
    private String culoare;
    private double greutate;

    public Masa() {
        this.culoare = "";
        this.greutate = 0;
    }

    public Masa(String culoare, double greutate) {
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
        Masa clona = new Masa();
        clona.culoare = this.culoare;
        clona.greutate = this.greutate;
        return clona;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "culoare='" + culoare + '\'' +
                ", greutate=" + greutate +
                '}';
    }
}
