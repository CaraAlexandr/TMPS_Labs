package utilities;

import models.Vehicle;

public class VehicleInspectionProxy extends Vehicle {
    private final Vehicle vehicle;

    public VehicleInspectionProxy(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

/*
    @Override
    public void displayDetails() {
        vehicle.displayDetails();
    }
*/

    @Override
    public void displayDetails() {
        System.out.println("Inspecting the vehicle...");

        // Inspection logic
        if (vehicle.getColor() == null || vehicle.getColor().isEmpty()) {
            System.out.println("Inspection Failed: Color not set.");
        } else {
            System.out.println("Color: " + vehicle.getColor() + " - OK");
        }

        if (vehicle.getEngineType() == null || vehicle.getEngineType().isEmpty()) {
            System.out.println("Inspection Failed: Engine type not set.");
        } else {
            System.out.println("Engine Type: " + vehicle.getEngineType() + " - OK");
        }

        if (vehicle.getNumberOfWheels() <= 0) {
            System.out.println("Inspection Failed: Invalid number of wheels.");
        } else {
            System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels() + " - OK");
        }

        System.out.println("Inspection completed!");
    }
}
