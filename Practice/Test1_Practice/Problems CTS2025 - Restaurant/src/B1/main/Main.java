package B1.main;

import B1.factory.SupaFactory;
import B1.factory.TipSupa;
import B1.models.Supa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingrediente = new ArrayList<>();
        ingrediente.add("ceapa");
        ingrediente.add("sare");
        ingrediente.add("apa");

        SupaFactory supaFactory = new SupaFactory();

        Supa s1 = supaFactory.creareSupa(TipSupa.CIUPERCI, "supa de ciuperci", ingrediente, 10);
        System.out.println(s1.toString());

        Supa s2 = supaFactory.creareSupa(TipSupa.VITA, "supa vita", ingrediente, 20);
        System.out.println(s2.toString());
    }
}
