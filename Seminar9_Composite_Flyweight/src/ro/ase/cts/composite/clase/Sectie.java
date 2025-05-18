package ro.ase.cts.composite.clase;

public class Sectie implements Structura {
    private String nume;
    private int numarLocuri;

    public Sectie(String nume, int numarLocuri) {
        this.nume = nume;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectia " + this.nume + " are " + this.numarLocuri + " locuri\n");
    }
}
