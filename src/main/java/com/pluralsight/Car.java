package com.pluralsight;

public class Car extends Vehicle{
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
