package ro.cts.readers;

import ro.cts.model.Aplicant;
import ro.cts.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public StudentReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while(input.hasNext()) {
            Student student = new Student();

            super.readAplicantData(input, student);
            student.setAnStudii(input.nextInt());
            student.setFacultate(input.next());

            studenti.add(student);
        }

        input.close();
        return studenti;
    }
}
