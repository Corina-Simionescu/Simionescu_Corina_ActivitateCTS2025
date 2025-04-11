package A1.main;

import A1.builder.Pacient;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- BUILDER -----------------");

        System.out.println("Testare: In cazul in care pacientul nu alege facilitațile extra, in cadrul aplicației sunt setate cu false");
        Pacient p1 = Pacient.builder("ana").build();
        System.out.println(p1.toString());


    }
}
