package factory;

import models.Car;
import models.Motorcycle;
import models.Truck;
import models.Vehicle;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Motorcycle".equalsIgnoreCase(type)) {
            return new Motorcycle();
        } else if ("Truck".equalsIgnoreCase(type)) {
            return new Truck();
        }
        return null;
    }
}
