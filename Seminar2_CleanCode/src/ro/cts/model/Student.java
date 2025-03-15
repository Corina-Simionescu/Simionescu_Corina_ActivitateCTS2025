package ro.cts.model;

import java.util.Arrays;

public class Student extends Aplicant {
    private static float sumaFinantata = 20;

    private String facultate;
    private int anStudii;

    public Student() {
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Student.sumaFinantata = sumaFinantata;
    }

    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect=" + Arrays.toString(denumireProiect) + ", Facultate=" + facultate + ", An_studii=" + anStudii;
    }

    public void afiseazaFinantarePrimita() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + " Euro/zi in proiect.");
    }
}
