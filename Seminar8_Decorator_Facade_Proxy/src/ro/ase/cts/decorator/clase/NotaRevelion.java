package ro.ase.cts.decorator.clase;

public class NotaRevelion extends NotaDecorata {
    public NotaRevelion(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("An nou fericit!");
    }
}
