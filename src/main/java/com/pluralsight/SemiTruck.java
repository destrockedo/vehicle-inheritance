package com.pluralsight;

public class SemiTruck extends Vehicle{

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfTrailers) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfTrailers = numberOfTrailers;
    }

    private int numberOfTrailers;

    public void loadCargo() {
        System.out.println("Cargo load");

    }

    public void unloadCargo() {
        System.out.println("Cargo unload");

    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }
}
