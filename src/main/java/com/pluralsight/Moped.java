package com.pluralsight;

public class Moped extends Vehicle{

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int maxWeight) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxWeight = maxWeight;
    }

    private int maxWeight;

    public void ride() {
        System.out.println("Riding moped");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
