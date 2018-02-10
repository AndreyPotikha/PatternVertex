package controller;

import model.Conservative;
import model.Fruit;
import model.enums.TypeOfFruit;
import service.factory.GildFactory;
import service.GildService;
import service.proxy.ProxyGildService;

public class GildController {

    public static void main(String[] args) {

        Fruit apple = new Fruit(5,2, TypeOfFruit.APPLE);
        Fruit pineapple = new Fruit(10,15, TypeOfFruit.PINEAPPLE);
        Fruit peach = new Fruit(15,20, TypeOfFruit.PEACH);

        ProxyGildService gildService = new ProxyGildService();
        Conservative conservative3 = gildService.makeConservation(apple);
        Conservative conservative = gildService.makeConservation(pineapple);
        Conservative conservative1 = gildService.makeConservation(peach);
        System.out.println(conservative3);
        System.out.println(conservative);
        System.out.println(conservative1);
        System.out.println(GildService.num);
    }
}
