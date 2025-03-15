package ro.cts.model;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private static float sumaFinantata = 10;

    private float salariu;
    private String ocupatie;

    public Angajat() {
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, float salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "salariu=" + salariu +
                ", ocupatie='" + ocupatie + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                '}';
    }

    public void afiseazaFinantarePrimita() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + "Euro/zi in proiect.");
    }
}
