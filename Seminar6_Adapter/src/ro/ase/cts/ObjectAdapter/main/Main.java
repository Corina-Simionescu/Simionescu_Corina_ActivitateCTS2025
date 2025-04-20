package ro.ase.cts.ObjectAdapter.main;

import ro.ase.cts.ObjectAdapter.models.AdapterMedicament;
import ro.ase.cts.ObjectAdapter.models.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solved problem: Problems CTS2025 - Hospital -> A5\n");

        AdapterMedicament adapterMedicament = new AdapterMedicament(new MedicamentSpital("paracetamol", 10));
        adapterMedicament.cumparaMedicament();

        AdapterMedicament adapterMedicament2 = new AdapterMedicament(new MedicamentSpital("vitamina C", 1));
        adapterMedicament2.cumparaMedicament();
    }
}
