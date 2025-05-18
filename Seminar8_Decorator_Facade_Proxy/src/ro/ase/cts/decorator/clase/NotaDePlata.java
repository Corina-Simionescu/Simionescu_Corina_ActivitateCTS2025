package ro.ase.cts.decorator.clase;

public class NotaDePlata implements Nota {
    private float total;

    public NotaDePlata(float total) {
        this.total = total;
    }

    @Override
    public void printare() {
        System.out.println("Nota de plata: " + this.total);
    }
}
