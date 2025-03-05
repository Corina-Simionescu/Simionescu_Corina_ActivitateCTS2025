package ro.cts.main;

import ro.cts.model.personal.Asistent;
import ro.cts.model.personal.Profesor;
import ro.cts.model.personal.Student;
import ro.cts.model.platforma.Curs;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ana", 21, 1, 3);
        Student student2 = new Student("dorel", 21, 2, 1);
        Asistent asistent1 = new Asistent("as1", 30, 1, 1);
        Asistent asistent2 = new Asistent("as2", 30, 2, 10);
        Profesor profesor1 = new Profesor("prof", 40, 1, 10);
        
        student1.afiseazaModInvatare();
        student2.afiseazaModInvatare();

        asistent1.afiseazaModInvatare();
        asistent2.afiseazaModInvatare();
        asistent1.preda();

        profesor1.afiseazaModInvatare();
        profesor1.preda();
    }
}
