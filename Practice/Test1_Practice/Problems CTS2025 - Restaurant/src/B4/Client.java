package B4;

import java.util.ArrayList;
import java.util.List;

public class Client implements IClient {
    private String nume;
    private int nrPersoane;
    private List<String> comenzi;

    public Client() {
    }

    public Client(String nume, int nrPersoane, List<String> comenzi) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.comenzi = comenzi;
        try {
            System.out.println("Apelare constructor care dureaza mult...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void addComanda(String comanda) {
        this.comenzi.add(comanda);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", comenzi=" + comenzi +
                '}';
    }

    @Override
    public Client clonare() {
        Client clona = new Client();
        clona.nume = this.nume;
        clona.nrPersoane = this.nrPersoane;
        clona.comenzi = new ArrayList<>(this.comenzi);
        return clona;
    }
}
