package ro.cts.model;

import java.util.Arrays;

public class Elev extends Aplicant {
    private static float sumaFinantata = 30;

    private int clasa;
    private String tutore;

    public Elev() {
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Elev.sumaFinantata = sumaFinantata;
    }

    @Override
    public String toString() {
        return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
                + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
                + Arrays.toString(denumireProiect) + ", Clasa=" + clasa + ", Tutore=" + tutore;
    }

    public void afiseazaFinantarePrimita() {
        System.out.println("Elevul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + " Euro/zi in proiect.");
    }
}
