package ro.ase.cts.ClassAdapter.models;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie) {
        System.out.println("Farmacia " + this.nume + " are medicamentul :");
        medicamentFarmacie.cumparaMedicament();
    }
}
