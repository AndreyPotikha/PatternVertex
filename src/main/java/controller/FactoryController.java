package controller;

import model.Fruit;
import model.enums.TypeOfFruit;
import service.FactoryPineapple;

public class FactoryController {

    public static void main(String[] args) {

        FactoryPineapple pineappleFactory = new FactoryPineapple();

        Fruit apple = new Fruit(5,10, TypeOfFruit.APPLE);
        Fruit pineapple = new Fruit(10,15, TypeOfFruit.PINEAPPLE);
        Fruit peach = new Fruit(15,20, TypeOfFruit.PEACH);

        double appleFructose = pineappleFactory.makeFactory(apple);
        double pineapleFructose = pineappleFactory.makeFactory(pineapple);
        double peachFroctose = pineappleFactory.makeFactory(peach);

        System.out.println(appleFructose);
        System.out.println(pineapleFructose);
        System.out.println(peachFroctose);
    }
}
