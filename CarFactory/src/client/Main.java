package client;

import factory.*;
import models.*;
import utilities.*;

public class Main {
    public static void main(String[] args) {

        // Using Factory pattern
        System.out.println("\n====================\nFactory Pattern:\n====================");
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
        System.out.println("\n====================\nBuilder Pattern:\n====================");
        VehicleBuilder carBuilder = new CarBuilder();
        Vehicle customCar = carBuilder.setColor("Green")
                .setEngineType("Diesel")
                .setNumberOfWheels(4)
                .build();

        customCar.displayDetails();

        // Using Prototype pattern
        System.out.println("\n====================\nPrototype Pattern:\n====================");
        Vehicle prototypeCar = new Car();
        prototypeCar.setColor("Red");

        Vehicle clonedCar = (Vehicle) prototypeCar.clone();
        System.out.println("Color of cloned car: " + clonedCar.getColor());


        // Using Singleton pattern
        System.out.println("\n====================\nSingleton Pattern:\n====================");
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        configManager1.setConfiguration("Initial Configuration for manager 1");

        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println("Configuration from manager 2: " + configManager2.getConfiguration());

        if (configManager1 == configManager2) {
            System.out.println("Both configuration managers point to the same instance.");
        } else {
            System.out.println("Different instances detected.");
        }

        Vehicle customCarWithFeatures = new NavigationSystemDecorator(new LeatherSeatsDecorator(customCar));
        customCarWithFeatures.displayDetails();


        System.out.println("\n======================================================================================");


        // Using Proxy pattern
        System.out.println("\n====================\nProxy Pattern:\n====================");
        VehicleInspectionProxy inspectionProxy = new VehicleInspectionProxy(customCarWithFeatures);
        inspectionProxy.inspectVehicle();

        customCarWithFeatures.setColor("Yellow");
        customCarWithFeatures.setEngineType("Gasoline");
        customCarWithFeatures.setNumberOfWheels(4);
        inspectionProxy.inspectVehicle();

        // Using Facade pattern
        System.out.println("\n====================\nFacade Pattern:\n====================");
        VehiclePreparationFacade preparationFacade = new VehiclePreparationFacade();
        preparationFacade.prepareForDelivery();

        // Using Adapter pattern
        System.out.println("\n====================\nAdapter Pattern:\n====================");
        TPMS tpms = new TPMS();
        VehicleAdapter adaptedVehicle = new VehicleAdapter(tpms);
        System.out.println("Tire Pressure from adapted vehicle: " + adaptedVehicle.getVehicleTirePressure());

        // Using Composite pattern
        System.out.println("\n====================\nComposite Pattern:\n====================");
        VehicleComponent car1 = new SingleVehicle(car); // Assuming 'car' is an instance of the Vehicle class
        VehicleComponent car2 = new SingleVehicle(motorcycle); // Assuming 'motorcycle' is an instance of the Vehicle class
        VehicleFleet fleet1 = new VehicleFleet();
        fleet1.add(car1);
        fleet1.add(car2);

        VehicleComponent truckComponent = new SingleVehicle(truck); // Assuming 'truck' is an instance of the Vehicle class
        VehicleFleet mainFleet = new VehicleFleet();
        mainFleet.add(fleet1);
        mainFleet.add(truckComponent);

        mainFleet.displayDetails(); // This will display details for car, motorcycle, and truck
    }
}
