package service;

import model.Conservative;
import model.Fruit;
import model.enums.TypeOfFruit;
import service.factory.GildFactory;

public class GildService implements GildFactory{

    private static GildService instance = null;
    public static int num = 0;

    private GildService() {
        num++;
    }

    public static GildService gildService() {
        if (instance == null) {
            instance = new GildService();
        }
        return instance;
    }
    public Conservative makeConservation(Fruit fruit) {
        if (fruit.getTypeOfFruit().equals(TypeOfFruit.APPLE)) {
            return Conservative.newBuilder().setFruit(fruit).setSugar(2).setWater(3).build();
        } else if (fruit.getTypeOfFruit().equals(TypeOfFruit.PINEAPPLE)) {
            return Conservative.newBuilder().setFruit(fruit).setSugar(1).setWater(2).build();
        } else if (fruit.getTypeOfFruit().equals(TypeOfFruit.PEACH)) {
            return Conservative.newBuilder().setFruit(fruit).setSugar(1).setWater(1).build();
        }

        return null;
    }

}
