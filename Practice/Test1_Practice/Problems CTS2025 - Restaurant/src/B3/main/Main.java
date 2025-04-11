package B3.main;

import B3.factories.*;
import B3.models.Mancare;

public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();
        DesertFactory desertFactory = new DesertFactory();

        Mancare supa1 = supaFactory.creareMancare(TipSupa.VITA, "supa vita", 20);
        Mancare desert1 = desertFactory.creareMancare(TipDesert.PAPANASI, "papanasi", 30);

        System.out.println(supa1.toString());
        System.out.println(desert1.toString());
    }
}
