package ro.ase.cts.decorator.clase;

public abstract class NotaDecorata implements Nota {
    private Nota nota;

    public NotaDecorata(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printare() {
        nota.printare();
        this.printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
