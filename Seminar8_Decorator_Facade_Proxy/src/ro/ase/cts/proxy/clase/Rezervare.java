package ro.ase.cts.proxy.clase;

public class Rezervare implements IRezervare {
    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervare pe numele " + numeClient + " pentru " + numarPersoane + " persoane");
    }
}
