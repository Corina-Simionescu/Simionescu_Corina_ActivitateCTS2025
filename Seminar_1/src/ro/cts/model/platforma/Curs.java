package ro.cts.model.platforma;

import ro.cts.model.personal.IPersoana;
import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Profesor;
import ro.cts.model.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;
    private IPredabil cadruDidactic;

    public Curs(String numeCurs, int credite, Profesor profesor, List<Student> studenti, IPredabil cadruDidactic) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
        this.cadruDidactic = cadruDidactic;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void sustinereExamen() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cadrul didactic ").append(((IPersoana) this.cadruDidactic).getNume())
                     .append(" are examen la ").append(this.numeCurs).append(" cu urmatorii studenti: ");
        System.out.println(stringBuilder);

        for (Student student: studenti) {
            System.out.println(student.getNume());
        }
    }
}
