package ro.cts.model.personal;

public class Student extends Persoana {
    private int idStudent;
    private int aniStudiu;

    public Student(String nume, int varsta, int idStudent, int aniStudiu) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.aniStudiu = aniStudiu;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAniStudiu() {
        return aniStudiu;
    }

    public void setAniStudiu(int aniStudiu) {
        this.aniStudiu = aniStudiu;
    }

    public void afiseazaModInvatare() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Studentul ").append(this.getNume()).append(" invata de ").append(this.aniStudiu)
                     .append(this.aniStudiu > 1 ? " ani" : " an");
        System.out.println(stringBuilder);
    }
}
