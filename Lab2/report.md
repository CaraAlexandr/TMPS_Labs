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

Implementation
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
## Conclusion
By leveraging the Factory Method and Builder patterns, we've established a flexible system for creating and customizing vehicles in the manufacturing domain. These patterns not only enhance code readability and maintainability but also provide a robust mechanism for object creation and instantiation.