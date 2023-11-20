package utilities.strategy;

import models.Factory;

public class CarFactoryConstructionStrategy implements FactoryConstructionStrategy {
    @Override
    public void constructFactory(Factory factory) {
        System.out.println("Constructing a car factory at " + factory.getAddress());
        // Additional logic specific to constructing a car factory
    }
}