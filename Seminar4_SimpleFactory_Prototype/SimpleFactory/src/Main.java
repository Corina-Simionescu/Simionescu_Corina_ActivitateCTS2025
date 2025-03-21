import cts.ro.factory.Kitchen;
import cts.ro.factory.SoupType;
import cts.ro.models.Soup;

public class Main {
    public static void main(String[] args) {
        Soup vegetableSoup = Kitchen.createSoup(SoupType.VEGETABLE, 10, 200, 30, true);
        Soup mushroomsSoup = Kitchen.createSoup(SoupType.MUSHROOMS, 20, 150, 60, true);
        Soup beefSouo = Kitchen.createSoup(SoupType.BEEF, 30, 300, 700, false);

        vegetableSoup.printDescription();
        mushroomsSoup.printDescription();
        beefSouo.printDescription();
        System.out.println(vegetableSoup.calculateFinalPrice());
    }
}
