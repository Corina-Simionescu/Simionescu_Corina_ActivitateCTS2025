package A4.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
    private String nume;
    private Map<String, Double> solutii;

    public Reteta() {
        this.solutii = new HashMap<>();
    }

    public Reteta(String nume, Map<String, Double> solutii) {
        this.nume = nume;
        this.solutii = solutii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = solutii;
    }

    public void addSolutie(String nume, Double cantitate) {
        this.solutii.put(nume, cantitate);
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }

    @Override
    public IReteta clonare() {
        Reteta clona = new Reteta();
        clona.nume = nume;
        for (Map.Entry<String, Double> entry : this.solutii.entrySet()) {
            clona.solutii.put(entry.getKey(), entry.getValue());
        }
        return clona;
    }
}
