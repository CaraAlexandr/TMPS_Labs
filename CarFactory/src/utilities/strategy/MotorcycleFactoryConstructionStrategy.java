package utilities.strategy;

import models.Factory;

public class MotorcycleFactoryConstructionStrategy implements FactoryConstructionStrategy {
    @Override
    public void constructFactory(Factory factory) {
        System.out.println("Constructing a motorcycle factory at " + factory.getAddress());
        // Additional logic specific to constructing a motorcycle factory
    }
}