package ro.cts.readers;

import ro.cts.model.Aplicant;
import ro.cts.model.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev elev = new Elev();

            super.readAplicantData(input, elev);
            elev.setClasa(input.nextInt());
            elev.setTutore(input.next());

            elevi.add(elev);
        }

        input.close();
        return elevi;
    }
}
