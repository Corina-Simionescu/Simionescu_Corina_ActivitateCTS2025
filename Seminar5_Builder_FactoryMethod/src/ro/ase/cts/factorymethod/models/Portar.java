package ro.ase.cts.factorymethod.models;

public class Portar extends Angajat {
    private int vechime;

    public Portar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        return "Portar{" +
                "vechime=" + vechime +
                "} " + super.toString();
    }
}
