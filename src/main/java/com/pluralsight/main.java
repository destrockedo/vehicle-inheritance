package com.pluralsight;

public class main {
    public static void main(String[] args) {

        Moped terrible = new Moped();
        terrible.setColor("Purple");
        terrible.setFuelCapacity(6);

        Car decent = new Car();
        decent.setCargoCapacity(400);
        decent.setFuelCapacity(10);

        System.out.println("Moped:");
        System.out.println("Color: " + terrible.getColor());
        System.out.println("Fuel Capacity: " + terrible.getFuelCapacity());

        System.out.println();

        System.out.println("Car:");
        System.out.println("Cargo Capacity: " + decent.getCargoCapacity());
        System.out.println("Fuel Capacity: " + decent.getFuelCapacity());


    }
}
