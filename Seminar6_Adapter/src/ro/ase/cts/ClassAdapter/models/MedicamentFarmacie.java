package ro.ase.cts.ClassAdapter.models;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String nume;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String nume, float pret, boolean esteInStoc) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament() {
        if (esteInStoc) {
            System.out.println("Medicamentul " + this.nume + " cu pretul" + this.pret + " a fost cumparat");
        } else {
            System.out.println("Medicamentul " + this.nume + " cu pretul" + this.pret + " nu este in stoc");
        }
    }
}
