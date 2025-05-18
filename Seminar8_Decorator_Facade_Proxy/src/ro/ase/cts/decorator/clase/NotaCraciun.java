package ro.ase.cts.decorator.clase;

public class NotaCraciun extends NotaDecorata {
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
