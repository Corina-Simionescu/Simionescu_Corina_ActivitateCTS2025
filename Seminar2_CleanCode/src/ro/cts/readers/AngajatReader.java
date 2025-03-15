package ro.cts.readers;

import ro.cts.model.Angajat;
import ro.cts.model.Aplicant;
import ro.cts.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(getFileName()));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();

            super.readAplicantData(input, angajat);
            angajat.setSalariu(input.nextFloat());
            angajat.setOcupatie(input.next());

            angajati.add(angajat);
        }

        input.close();
        return angajati;
    }
}
