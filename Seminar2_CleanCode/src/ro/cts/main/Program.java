package ro.cts.main;

import ro.cts.model.Angajat;
import ro.cts.model.Aplicant;
import ro.cts.readers.AngajatReader;
import ro.cts.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/src/ro/cts/main/resources/angajati.txt";
        AplicantReader aplicantReader = new AngajatReader(filePath);

        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = aplicantReader.readAplicanti();
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
