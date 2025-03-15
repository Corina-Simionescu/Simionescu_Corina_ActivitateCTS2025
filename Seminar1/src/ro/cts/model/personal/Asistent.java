package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float aniExperienta;

    public Asistent(String nume, int varsta, int idAsistent, float aniExperienta) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.aniExperienta = aniExperienta;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public float getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(float aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asistentul ").append(this.getNume()).append(" preda la seminar de ")
                     .append(this.aniExperienta).append(this.aniExperienta > 1 ? " ani" : " an");

        System.out.println(stringBuilder);
    }

    @Override
    public void preda() {
        System.out.println("Asistentul " + this.getNume() + " preda la seminar!");
    }
}
