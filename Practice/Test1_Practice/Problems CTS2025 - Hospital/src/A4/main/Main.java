package A4.main;

import A4.prototype.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("paracetamol", 100.0);
        solutii.put("apa", 200.0);
        solutii.put("aspirina", 10.0);

        Reteta r1 = new Reteta("medicament raceala", solutii);
        System.out.println(r1.toString());

        Reteta r2 = (Reteta) r1.clonare();
        r2.addSolutie("miere", 30.0);
        System.out.println(r2.toString());
    }
}
