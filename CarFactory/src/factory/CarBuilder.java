package factory;

import models.Car;
import models.Vehicle;

public class CarBuilder implements VehicleBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public VehicleBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public VehicleBuilder setEngineType(String engineType) {
        car.setEngineType(engineType);
        return this;
    }

    @Override
    public VehicleBuilder setNumberOfWheels(int numberOfWheels) {
        car.setNumberOfWheels(numberOfWheels);
        return this;
    }

    @Override
    public Vehicle build() {
        return car;
    }
}
