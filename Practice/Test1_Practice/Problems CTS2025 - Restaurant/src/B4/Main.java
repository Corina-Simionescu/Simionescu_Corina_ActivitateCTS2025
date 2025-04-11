package B4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> comenzi = new ArrayList<>();
        comenzi.add("apa");
        comenzi.add("ciorba");
        comenzi.add("pizza");

        Client c1 = new Client("ana", 4, comenzi);
        Client c2 = c1.clonare();
        c2.addComanda("papanasi");

        System.out.println("Sunt cele 2 obiecte identice? -> " + (c1 == c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
