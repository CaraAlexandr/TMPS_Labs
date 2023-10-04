# Topic: *Creational Design Patterns*

## Author: Cara Alexandr
### Group: FAF-212

---

# Introduction
This report showcases the use of creational design patterns in the domain of "Vehicle Manufacturing". We have implemented two primary patterns: Factory Method and Builder Pattern.

## Domain Overview
In the vehicle manufacturing domain, we have various types of vehicles like Cars, Motorcycles, and Trucks. Each vehicle can have different attributes such as color, engine type, and the number of wheels.

## Factory Method Pattern
### Purpose
The Factory Method Pattern provides an interface for creating instances of a class, with its subclasses deciding which class to instantiate. This pattern abstracts the instantiation process and delegates it to the subclasses.

### Implementation
In our domain, the VehicleFactory class uses the Factory Method pattern to create specific types of vehicles.

VehicleFactory.java
```java
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
```
Using this factory, we can easily create instances of different vehicle types without knowing the specific class details.

## Builder Pattern
### Purpose
The Builder Pattern allows for the step-by-step creation of complex objects. This pattern is particularly useful when an object needs to be created with numerous optional components or configurations.

### Implementation
For our domain, we introduced the VehicleBuilder interface that outlines the methods required to build a vehicle. Concrete builders like CarBuilder then provide the specific implementations.

VehicleBuilder.java
```java
public interface VehicleBuilder {
    VehicleBuilder setColor(String color);
    VehicleBuilder setEngineType(String engineType);
    VehicleBuilder setNumberOfWheels(int numberOfWheels);
    Vehicle build();
}
```
Using this builder, clients can create custom vehicles by chaining method calls.

```java
VehicleBuilder carBuilder = new CarBuilder();
        Vehicle customCar = carBuilder.setColor("Green")
        .setEngineType("Diesel")
        .setNumberOfWheels(4)
        .build();
```
## Singleton Pattern - Completion
### Purpose
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This pattern is used when you want to eliminate the option of instantiating more than one object.

### Scenario
In our vehicle manufacturing system, a ConfigurationManager is used to store configurations. Using the Singleton pattern, we can make sure there's only one instance of this manager.

Implementation
ConfigurationManager.java (Singleton Class)
```java
package utilities;

public class ConfigurationManager {
private static ConfigurationManager instance;
private String configuration;

    private ConfigurationManager() {
        // private constructor to restrict instantiation
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
```

## Prototype Pattern
### Purpose
The Prototype pattern creates a fully initialized instance that can be cloned or copied to produce a new instance. This avoids the overhead of creating a fresh object from scratch.

### Scenario
In our vehicle manufacturing system, once a vehicle is designed with certain configurations, we might want to produce similar vehicles without going through the complete initialization process. Using the Prototype pattern, we can clone an existing vehicle to create a new one.

### Implementation
Vehicle.java (Modification to Support Cloning)
```java
package models;

public abstract class Vehicle implements Cloneable {
// ... previous code ...

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
```

## Conclusion
By leveraging the Factory Method and Builder patterns, we've established a flexible system for creating and customizing vehicles in the manufacturing domain. These patterns not only enhance code readability and maintainability but also provide a robust mechanism for object creation and instantiation.