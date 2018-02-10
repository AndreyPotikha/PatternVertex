package model;

import model.enums.TypeOfFruit;

public final class Fruit {

    private final double sweetness;
    private final double wateriness;
    private final TypeOfFruit typeOfFruit;

    public Fruit(double sweetness, double wateriness, TypeOfFruit typeOfFruit) {
        this.sweetness = sweetness;
        this.wateriness = wateriness;
        this.typeOfFruit = typeOfFruit;
    }

    public double getSweetness() {
        return sweetness;
    }

    public double getWateriness() {
        return wateriness;
    }

    public TypeOfFruit getTypeOfFruit() {
        return typeOfFruit;
    }

    @Override
    public String toString() {
        return  "sweetness - " + sweetness +
                ", wateriness - " + wateriness +
                ", fruit - " + typeOfFruit;
    }
}
