package ro.ase.cts.ChainOfResponsability.clase;

public class RecomandaTroleibuz extends Handler {
    @Override
    public void recomandaMijlocTransport(int distanta) {
        if (distanta <= 3) {
            System.out.println("Pentru distanta de " + distanta + " km, circulati cu troleibuzul!");
        } else {
            this.urmatorul.recomandaMijlocTransport(distanta);
        }
    }
}
