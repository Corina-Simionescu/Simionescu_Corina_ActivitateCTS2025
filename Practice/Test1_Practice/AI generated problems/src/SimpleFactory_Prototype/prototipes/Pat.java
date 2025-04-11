package SimpleFactory_Prototype.prototipes;

public class Pat implements Mobilier {
    private String culoare;
    private double greutate;

    public Pat() {
        this.culoare = "";
        this.greutate = 0;
    }

    public Pat(String culoare, double greutate) {
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
        Pat clona = new Pat();
        clona.culoare = this.culoare;
        clona.greutate = this.greutate;
        return clona;
    }

    @Override
    public String toString() {
        return "Pat{" +
                "culoare='" + culoare + '\'' +
                ", greutate=" + greutate +
                '}';
    }
}
