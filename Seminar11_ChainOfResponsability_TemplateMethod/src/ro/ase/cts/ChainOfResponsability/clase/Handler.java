package ro.ase.cts.ChainOfResponsability.clase;

public abstract class Handler {
    protected Handler urmatorul;

    public void setUrmatorul(Handler urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomandaMijlocTransport(int distanta);
}
