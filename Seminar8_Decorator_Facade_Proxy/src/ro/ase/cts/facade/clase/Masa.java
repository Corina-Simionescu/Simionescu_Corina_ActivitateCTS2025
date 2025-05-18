package ro.ase.cts.facade.clase;

public class Masa {
    private int numar;
    private boolean esteLibera;

    public Masa(int numarMasa, boolean esteLibera) {
        this.numar = numarMasa;
        this.esteLibera = esteLibera;
    }

    public int getNumarMasa() {
        return numar;
    }

    public boolean getEsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa numarul ");
        sb.append(numar);
        sb.append(esteLibera ? " este libera" : " nu este libera");
        return sb.toString();
    }
}
