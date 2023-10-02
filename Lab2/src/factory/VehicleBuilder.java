package factory;

import models.Vehicle;

public interface VehicleBuilder {
    VehicleBuilder setColor(String color);
    VehicleBuilder setEngineType(String engineType);
    VehicleBuilder setNumberOfWheels(int numberOfWheels);
    Vehicle build();
}
