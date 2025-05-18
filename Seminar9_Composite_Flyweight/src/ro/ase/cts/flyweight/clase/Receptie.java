package ro.ase.cts.flyweight.clase;

import java.util.HashMap;

public class Receptie {
    private HashMap<String, IPacient> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<>();
    }

    public IPacient getPacient(String cnp, String nume, String adresa, String numarTelefon) {
        if (!this.pacienti.containsKey(cnp)) {
            return this.pacienti.put(cnp, new Pacient(cnp, nume, numarTelefon, adresa));
        }
        return this.pacienti.get(cnp);
    }

    public IPacient getPacient(String cnp) throws Exception {
        if (this.pacienti.containsKey(cnp)) {
            return this.pacienti.get(cnp);
        } else {
            throw new Exception("Pacientul cu CNP-ul " + cnp + " nu exista!");
        }
    }
}
