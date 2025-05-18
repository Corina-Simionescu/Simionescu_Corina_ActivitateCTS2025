package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IRezervare {
    private IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        if (numarPersoane >= 4) {
            rezervare.realizeazaRezervare(numeClient, numarPersoane);
        } else {
            System.out.println("Nu este nevoie de rezervare!");
        }
    }
}
