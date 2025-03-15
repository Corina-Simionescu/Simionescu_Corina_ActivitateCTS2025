package ro.cts.readers;

import ro.cts.model.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    private String fileName;

    public AplicantReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void readAplicantData(Scanner input, Aplicant aplicant) {
        aplicant.setNume(input.next());
        aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());
        aplicant.setNrProiecte(input.nextInt());

        String[] denumireProiect = new String[5];
        for (int i = 0; i < aplicant.getNrProiecte(); i++) {
            denumireProiect[i] = input.next();
        }
        aplicant.setDenumireProiect(denumireProiect);
    }
}
