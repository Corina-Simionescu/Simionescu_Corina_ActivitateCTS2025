package ro.ase.cts.ClassAdapter.main;

import ro.ase.cts.ClassAdapter.models.Farmacie;
import ro.ase.cts.ClassAdapter.models.IMedicamentFarmacie;
import ro.ase.cts.ClassAdapter.models.MedicamentFarmacie;
import ro.ase.cts.ClassAdapter.models.MedicamentSpital;
import ro.ase.cts.ClassAdapter.models.AdapterMedicament;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - Hospital -> A5\n");

        Farmacie farmacie = new Farmacie("dr max");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("paracetamol", 10, true);
        farmacie.vindeMedicament(medicamentFarmacie);

        AdapterMedicament adapterMedicament = new AdapterMedicament("ibuprofen", 20);
        farmacie.vindeMedicament(adapterMedicament);
    }
}
