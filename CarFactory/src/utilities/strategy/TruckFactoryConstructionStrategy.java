package utilities.strategy;

import models.Factory;

public class TruckFactoryConstructionStrategy implements FactoryConstructionStrategy {
    @Override
    public void constructFactory(Factory factory) {
        System.out.println("Constructing a truck factory at " + factory.getAddress());
        // Additional logic specific to constructing a truck factory
    }
}