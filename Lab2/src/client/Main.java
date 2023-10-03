package client;

import factory.*;
import models.*;
import utilities.*;

public class Main {
    public static void main(String[] args) {
        // Using Factory pattern
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

        // Using Builder pattern
        VehicleBuilder carBuilder = new CarBuilder();
        Vehicle customCar = carBuilder.setColor("Green")
                .setEngineType("Diesel")
                .setNumberOfWheels(4)
                .build();

        customCar.displayDetails();

        // Using Prototype pattern
        Vehicle prototypeCar = new Car();
        prototypeCar.setColor("Red");

        Vehicle clonedCar = (Vehicle) prototypeCar.clone();
        System.out.println("Color of cloned car: " + clonedCar.getColor());


        // Using Singleton pattern
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        configManager1.setConfiguration("Initial Configuration for manager 1");

        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println("Configuration from manager 2: " + configManager2.getConfiguration());

        if (configManager1 == configManager2) {
            System.out.println("Both configuration managers point to the same instance.");
        } else {
            System.out.println("Different instances detected.");
        }


        //======================================================================================
/*
        Vehicle customCarWithFeatures = new NavigationSystemDecorator(new LeatherSeatsDecorator(customCar));
        customCarWithFeatures.displayDetails();

        // Using Proxy pattern
        VehicleInspectionProxy inspectionProxy = new VehicleInspectionProxy(customCarWithFeatures);
        inspectionProxy.inspectVehicle();

        customCarWithFeatures.setColor("Yellow");
        customCarWithFeatures.setEngineType("Gasoline");
        customCarWithFeatures.setNumberOfWheels(4);
        inspectionProxy.inspectVehicle();
        */
    }
}
