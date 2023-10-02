package models;

public class Truck extends Vehicle {

    @Override
    public void displayDetails() {
        System.out.println("This is a Truck with color: " + getColor());
    }
}
