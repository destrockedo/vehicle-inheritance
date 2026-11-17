package com.pluralsight;

public class Car extends Vehicle{

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfDoors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    private int numberOfDoors;

    public void openTrunk(){
        System.out.println("Trunk open");
    }

    public void closeTrunk() {
        System.out.println("Trunk Close");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
