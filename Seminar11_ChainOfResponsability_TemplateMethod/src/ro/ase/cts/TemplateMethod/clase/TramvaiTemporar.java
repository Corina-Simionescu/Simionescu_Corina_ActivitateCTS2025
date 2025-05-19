package ro.ase.cts.TemplateMethod.clase;

public class TramvaiTemporar extends ATramvai {
    public TramvaiTemporar(int numarLinie) {
        super(numarLinie);
    }

    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul " + super.numarLinie + " opreste in statia 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul " + super.numarLinie + " opreste in statia 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul " + super.numarLinie + " NU opreste in statia 3 pentru ca statia este in reparatie");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul " + super.numarLinie + " opreste in statia 4");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul " + super.numarLinie + " opreste in statia 5");
    }
}
