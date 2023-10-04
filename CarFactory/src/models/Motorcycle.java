package models;

public class Motorcycle extends Vehicle {

    @Override
    public void displayDetails() {
        System.out.println("This is a Motorcycle with color: " + getColor());
    }
}
