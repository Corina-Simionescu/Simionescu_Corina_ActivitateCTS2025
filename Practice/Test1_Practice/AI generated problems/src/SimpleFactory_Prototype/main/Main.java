package SimpleFactory_Prototype.main;

import SimpleFactory_Prototype.factory.MobilierFactory;
import SimpleFactory_Prototype.factory.TipMobilier;
import SimpleFactory_Prototype.prototipes.Mobilier;

public class Main {
    public static void main(String[] args) {
        MobilierFactory mobilierFactory = new MobilierFactory();
        Mobilier m1 = mobilierFactory.creareMobilier(TipMobilier.Scaun, "roz", 5);
        Mobilier m2 = mobilierFactory.creareMobilier(TipMobilier.Scaun, "maro", 10);
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
