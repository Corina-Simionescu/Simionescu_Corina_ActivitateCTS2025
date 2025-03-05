package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {
    private int idAngajat;
    private int vechime;

    public Profesor(String nume, int varsta, int idAngajat, int vechime) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
        this.vechime = vechime;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public void afiseazaModInvatare() {
        System.out.println("Profesorul " + this.getNume() + " preda de " + this.vechime + " ani");
    }

    @Override
    public void preda() {
        System.out.println("Profesorul " + this.getNume() + " preda la curs!");
    }
}
