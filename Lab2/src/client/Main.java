package client;

import factory.CarBuilder;
import factory.VehicleBuilder;
import factory.VehicleFactory;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("Car");
        car.setColor("Red");
        car.displayDetails();

        Vehicle motorcycle = factory.createVehicle("Motorcycle");
        motorcycle.setColor("Blue");
        motorcycle.displayDetails();

        Vehicle truck = factory.createVehicle("Truck");
        truck.setColor("Black");
        truck.displayDetails();

        VehicleBuilder carBuilder = new CarBuilder();
        Vehicle customCar = carBuilder.setColor("Green")
                .setEngineType("Diesel")
                .setNumberOfWheels(4)
                .build();

        customCar.displayDetails();
    }
}
