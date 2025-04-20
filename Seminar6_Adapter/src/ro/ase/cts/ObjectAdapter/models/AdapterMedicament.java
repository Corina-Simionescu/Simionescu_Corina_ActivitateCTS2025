package ro.ase.cts.ObjectAdapter.models;

public class AdapterMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(String nume, float pret, boolean esteInStoc) {
        super(nume, pret, esteInStoc);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
