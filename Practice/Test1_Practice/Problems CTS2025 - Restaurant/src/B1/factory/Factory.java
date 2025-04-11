package B1.factory;

import B1.models.Supa;

import java.util.List;

public interface Factory {
    Supa creareSupa(TipSupa tipSupa, String nume, List<String> ingrediente, int pret);
}
