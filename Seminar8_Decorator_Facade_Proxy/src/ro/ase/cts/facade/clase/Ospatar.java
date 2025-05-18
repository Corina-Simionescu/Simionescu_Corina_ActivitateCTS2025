package ro.ase.cts.facade.clase;

public class Ospatar {
    public boolean esteAranjata(Masa masa) {
        return masa.getNumarMasa() % 5 == 0;
    }
}
