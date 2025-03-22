import cts.ro.models.Rezervation;
import cts.ro.models.StandardRezervation;

public class Main {
    public static void main(String[] args) {
        Rezervation r1 = new StandardRezervation("corina", 12, 22, 5, false);
        Rezervation r2 = r1.createCopy(23);
    }
}
