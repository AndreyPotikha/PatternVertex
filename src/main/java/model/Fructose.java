package model;

public class Fructose {

    private double fructose;

    public double getFructose() {
        return fructose;
    }

    public void setFructose(double fructose) {
        this.fructose = fructose;
    }

    @Override
    public String toString() {
        return "fructose - " + fructose;
    }
}
