package A2.simplefactory;

public class AngajatFactory {
    public Angajat creareAngajat(TipAngajat tipAngajat, String nume, int salariu) throws Exception {
        switch (tipAngajat) {
            case TipAngajat.Asistent -> {
                return new Asistent(nume, salariu);
            }
            case TipAngajat.Brancardier -> {
                return new Brancardier(nume, salariu);
            }
            case TipAngajat.Medic -> {
                return new Medic(nume, salariu);
            }
            default -> {
                throw new Exception("Tipul introdus nu exista");
            }
        }
    }
}
