package Singleton_Builder;

public class Main {
    public static void main(String[] args) {
        Joc j1 = Joc.builder().setCalitateGrafica("mare").setVolum(100).build();
        System.out.println(j1.toString());

        System.out.println("Demonstrare ca ConfiguratorJoc e singleton:");
        Joc.ConfiguratorJoc configuratorJoc1 = Joc.builder();
        Joc.ConfiguratorJoc configuratorJoc2 = Joc.builder();

        System.out.println("configuratorJoc1 == configuratorJoc1 -> " + (configuratorJoc1 == configuratorJoc2));
    }
}
