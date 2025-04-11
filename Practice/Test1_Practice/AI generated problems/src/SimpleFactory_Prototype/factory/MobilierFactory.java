package SimpleFactory_Prototype.factory;

import SimpleFactory_Prototype.prototipes.*;

public class MobilierFactory {
    private Scaun scaun = new Scaun();
    private Masa masa = new Masa();
    private Dulap dulap = new Dulap();
    private Pat pat = new Pat();

    public Mobilier creareMobilier(TipMobilier tipMobilier, String culoare, double greutate) {
        switch (tipMobilier) {
            case TipMobilier.Scaun -> {
                this.scaun.setCuloare(culoare);
                this.scaun.setGreutate(greutate);
                return this.scaun.clone();
            }
            case TipMobilier.Masă -> {
                this.masa.setCuloare(culoare);
                this.masa.setGreutate(greutate);
                return this.masa.clone();
            }
            case TipMobilier.Dulap -> {
                this.dulap.setCuloare(culoare);
                this.dulap.setGreutate(greutate);
                return this.dulap.clone();
            }
            case TipMobilier.Pat -> {
                this.pat.setCuloare(culoare);
                this.pat.setGreutate(greutate);
                return this.pat.clone();
            }
            default -> {
                System.out.println("Tipul de mobilier introdus nu exista");
                return null;
            }
        }
    }
}
