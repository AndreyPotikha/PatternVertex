package service.proxy;

import model.Conservative;
import model.Fruit;
import model.enums.TypeOfFruit;
import service.GildService;
import service.factory.GildFactory;

public class ProxyGildService implements GildFactory{

    private double appleWateriness = 3;
    private double pineappleWateriness = 4.5;
    private double peachWateriness = 4.5;

    GildFactory gildFactory = GildService.gildService();

    public Conservative makeConservation(Fruit fruit) {
        if (fruit.getTypeOfFruit().equals(TypeOfFruit.APPLE)) {
            if (fruit.getWateriness() >= appleWateriness) {
               return gildFactory.makeConservation(fruit);
            } else {
                System.out.println("Apple rotten");
            }
        } else if (fruit.getTypeOfFruit().equals(TypeOfFruit.PINEAPPLE)) {
            if (fruit.getWateriness() >= pineappleWateriness) {
               return gildFactory.makeConservation(fruit);
            } else {
                System.out.println("Pineapple rotten");
            }
        } else if (fruit.getTypeOfFruit().equals(TypeOfFruit.PEACH)) {
            if (fruit.getWateriness() >= peachWateriness) {
               return gildFactory.makeConservation(fruit);
            } else {
                System.out.println("Peach rotten");
            }
        }
        return null;
    }
}
