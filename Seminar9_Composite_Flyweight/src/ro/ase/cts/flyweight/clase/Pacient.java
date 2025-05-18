package ro.ase.cts.flyweight.clase;

public class Pacient implements IPacient {
    private String cnp;
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String cnp, String nume, String numarTelefon, String adresa) {
        this.cnp = cnp;
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public void detaliiPacient(Spitalizare spitalizare) {
        System.out.println("Pacient{" +
                "cnp = " + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}');
        System.out.println(spitalizare.toString());
    }
}
