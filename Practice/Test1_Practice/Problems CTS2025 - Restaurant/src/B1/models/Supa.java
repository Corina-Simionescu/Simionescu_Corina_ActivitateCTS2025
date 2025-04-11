package B1.models;

import java.util.List;

public abstract class Supa {
    String nume;
    List<String> ingrediente;

    public Supa(String nume, List<String> ingrediente) {
        this.nume = nume;
        this.ingrediente = ingrediente;
    }
}
