package com.three19;

public class Bicycle extends TwoWheeled {

    // instance variable declarations
    private int gears = 0;
    private double cost = 0.0;
    private double weight = 0.0;
    private String color = "";

    // constructor - default
    Bicycle() {
    }

    // constructor - String parameter
    Bicycle(String aColor) {
        this.color = aColor;
    }

    // constructor - int parameter
    Bicycle(int nbrOfGears) {
        this.gears = nbrOfGears;
    }

    // constructor - int, double, double, String parameters
    Bicycle(int nbrOfGears, double theCost, double theWeight, String aColor) {
        this.gears = nbrOfGears;
        this.cost = theCost;
        this.weight = theWeight;
        this.color = aColor;
    }

    // method to output Bicycle's information
    public void outputData() {
        System.out.println("\nBicycle Details:");
        System.out.println("Gears  : " + this.gears);
        System.out.println("Cost   : " + this.cost);
        System.out.println("Weight : " + this.weight + " lbs");
        System.out.println("Color  : " + this.color);
    }

    // method to output Bicycle's information - overloaded
    //  - method call chaining enabled
    public Bicycle outputData(String bikeText) {
        System.out.println("\nBicycle " + bikeText + " Details:");
        System.out.println("Gears  : " + this.gears);
        System.out.println("Cost   : " + this.cost);
        System.out.println("Weight : " + this.weight + " lbs");
        System.out.println("Color  : " + this.color);

        return this;
    }

    // Accessors (Getters)
    public int getGears() {
        return this.gears;
    }

    public double getCost() {
        return this.cost;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }


    // Mutators (Setters) - method call chaining enabled
    public Bicycle setGears(int nbr) {
        this.gears = nbr;
        return this;
    }

    public Bicycle setCost(double amt) {
        this.cost = amt;
        return this;
    }

    public Bicycle setWeight(double lbs) {
        this.weight = lbs;
        return this;
    }

    public Bicycle setColor(String theColor) {
        this.color = theColor;
        return this;
    }

}
