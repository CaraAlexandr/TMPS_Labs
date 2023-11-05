package utilities;

import models.Vehicle;

public class LeatherSeatsDecorator extends VehicleDecorator {

    public LeatherSeatsDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void displayDetails() {
        decoratedVehicle.displayDetails();
        System.out.println("Added Feature: Leather Seats");
    }
}
