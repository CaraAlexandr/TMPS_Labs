package utilities;

import models.Vehicle;

public abstract class VehicleDecorator extends Vehicle {
    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle decoratedVehicle) {
        this.decoratedVehicle = decoratedVehicle;
    }

    @Override
    public void displayDetails() {
        decoratedVehicle.displayDetails();
        System.out.println("Added Feature: " + this.getClass().getSimpleName());
    }
}
