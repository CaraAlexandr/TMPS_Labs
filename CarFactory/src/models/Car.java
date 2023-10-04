package models;

public class Car extends Vehicle {

    @Override
    public void displayDetails() {
        System.out.println("This is a Car: ");
        System.out.println("Color: " + getColor());
        System.out.println("Engine Type: " + getEngineType());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
    }
}
