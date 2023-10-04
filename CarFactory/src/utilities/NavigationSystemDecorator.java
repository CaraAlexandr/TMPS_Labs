package utilities;

import models.Vehicle;

public class NavigationSystemDecorator extends VehicleDecorator {

    public NavigationSystemDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void displayDetails() {
        decoratedVehicle.displayDetails();
        System.out.println("Added Feature: Navigation System");
    }
}
