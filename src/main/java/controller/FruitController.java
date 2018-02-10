package controller;

import model.Fruit;
import model.enums.TypeOfFruit;

public class FruitController {

    public static void main(String[] args) {
        TypeOfFruit typeOfFruit = null;

        Fruit apple = new Fruit(5, 10, typeOfFruit.APPLE);
        Fruit pineapple = new Fruit(10, 15, typeOfFruit.PINEAPPLE);
        Fruit peach = new Fruit(15, 20, typeOfFruit.PEACH);

        System.out.println(apple.getTypeOfFruit());
        System.out.println(pineapple);
        System.out.println(peach);
    }
}
