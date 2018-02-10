package service;

import model.Conservative;
import model.Fructose;
import model.Fruit;
import model.enums.TypeOfFruit;
import service.factory.GildFactory;

public class FactoryPineapple implements GildFactory{

    public double makeFactory(Fruit fruit) {

        Fructose fructose = new Fructose();

        if (fruit.getTypeOfFruit().equals(TypeOfFruit.APPLE)) {
            fructose.setFructose(4);
            return fructose.getFructose();
        } else if (fruit.getTypeOfFruit().equals(TypeOfFruit.PINEAPPLE)) {
            fructose.setFructose(8);
            return fructose.getFructose();
        } else if (fruit.getTypeOfFruit().equals(TypeOfFruit.PEACH)) {
            fructose.setFructose(12);
            return fructose.getFructose();
        }
        return 0;
    }

    public Conservative makeConservation(Fruit fruit) {
        GildService gildService = GildService.gildService();
        return gildService.makeConservation(fruit);
    }
}
