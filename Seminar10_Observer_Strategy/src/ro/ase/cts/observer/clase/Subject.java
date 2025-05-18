package ro.ase.cts.observer.clase;

public interface Subject {
    void adaugaObserver(Observer observer);

    void stergeObserver(Observer observer);

    void trimiteMesaj(String mesaj);
}