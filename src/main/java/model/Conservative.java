package model;

public class Conservative {

    private Fruit fruit;
    private double water;
    private double sugar;

    public Conservative() {
    }

    public Fruit getFruit() {
        return fruit;
    }

    public double getWater() {
        return water;
    }

    public double getSugar() {
        return sugar;
    }

    public static Builder newBuilder() {
        return new Conservative().new Builder();
    }


    public class Builder {

        public Builder() {
        }

        public Builder setFruit(Fruit fruit) {
            Conservative.this.fruit = fruit;
            return this;
        }

        public Builder setWater(double water) {
            Conservative.this.water = water;
            return this;
        }

        public Builder setSugar(double sugar) {
            Conservative.this.sugar = sugar;
            return this;
        }

        public Conservative build() {
            return Conservative.this;
        }
    }

    @Override
    public String toString() {
        return "Conservative {" +
                "fruit-" + fruit +
                ", additive water-" + water +
                ", sugar-" + sugar +
                '}' + " is created";
    }
}

