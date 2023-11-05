package utilities;

import models.Factory;
import models.FactoryType;
import strategy.*;

public class FactoryConstructionContext {
    private final FactoryConstructionStrategy strategy;

    // Setting the strategy based on the factory type
    public FactoryConstructionContext(FactoryType factoryType) {
        switch (factoryType) {
            case MOTORCYCLE:
                this.strategy = new MotorcycleFactoryConstructionStrategy();
                break;
            case CAR:
                this.strategy = new CarFactoryConstructionStrategy();
                break;
            case TRUCK:
                this.strategy = new TruckFactoryConstructionStrategy();
                break;
            default:
                throw new IllegalArgumentException("Unknown factory type: " + factoryType);
        }
    }

    public void constructFactory(Factory factory) {
        strategy.constructFactory(factory);
    }
}
