package ro.ase.cts.ObjectAdapter.models;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + this.nume + " a fost achizitionat la pretul de " + this.pret + (this.pret == 1 ? " leu" : " lei"));
    }

    private void prezintaReteta() {
        System.out.println("Reteta pentru medicamentul " + this.nume + " a fost prezentata");
    }
}
