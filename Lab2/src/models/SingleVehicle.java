package models;

public class SingleVehicle extends VehicleComponent {
    private Vehicle vehicle;

    public SingleVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void displayDetails() {
        vehicle.displayDetails();
    }
}
