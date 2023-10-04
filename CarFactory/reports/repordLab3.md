# Topic: Structural Design Patterns
## Author: Cara Alexandr
## Group: FAF-212

---

## Introduction
This report elaborates on the application of structural design patterns in the domain of "Vehicle Manufacturing". Four primary patterns have been implemented: Adapter, Composite, Bridge, and Facade.

## Domain Overview
Within the vehicle manufacturing domain, we have a variety of vehicles such as Cars, Motorcycles, and Trucks. Each vehicle can possess unique attributes like color, engine type, and number of wheels.

## Adapter Pattern
### Purpose
The Adapter Pattern acts as a bridge between two incompatible interfaces. This pattern involves a single class, known as an Adapter, which joins functionalities of independent or incompatible interfaces.

### Implementation
In our domain, the TPMS (Tire Pressure Monitoring System) has an interface different from our vehicle system. We create a VehicleAdapter to make the TPMS compatible with our vehicle system.

```java
package utilities;

public class VehicleAdapter {
    private TPMS tpms;

    public VehicleAdapter(TPMS tpms) {
        this.tpms = tpms;
    }

    public double getVehicleTirePressure() {
        return tpms.getTirePressure();
    }
}
```
## Composite Pattern

### Purpose

The Composite Pattern is used to treat individual objects and composites uniformly. It allows you to compose objects into tree structures to represent part-whole hierarchies.

### Implementation
For our domain, SingleVehicle represents individual vehicles, while VehicleFleet can consist of multiple vehicles or even other VehicleFleet objects, forming a tree structure.

```java
package models;

public abstract class VehicleComponent {
    public void add(VehicleComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(VehicleComponent component) {
        throw new UnsupportedOperationException();
    }

    public VehicleComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void displayDetails() {
        throw new UnsupportedOperationException();
    }
}

```
## Bridge Pattern
### Purpose
The Bridge Pattern decouples an abstraction from its implementation so that the two can vary independently.

### Implementation
In our vehicle domain, Vehicle (like Car and Truck) is the abstraction, and VehicleColor (like RedColor or BlueColor) is the implementation. The bridge is the association between a Vehicle and its VehicleColor.

```java
public abstract class Vehicle {
protected VehicleColor color;

    public Vehicle(VehicleColor color) {
        this.color = color;
    }

    public abstract void manufacture();
}

public class Car extends Vehicle {
// ... methods ...
}

public class Truck extends Vehicle {
// ... methods ...
}
```
## Facade Pattern
### Purpose
The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

### Implementation
A VehiclePreparationFacade has been introduced to simplify complex vehicle preparation processes like quality checks, tire installation, and painting.

```java
public class VehiclePreparationFacade {
public void prepareForDelivery() {
// ... simplifying complex operations ...
}
}
```
# Conclusion
Structural Design Patterns, such as Adapter, Composite, Bridge, and Facade, have been successfully employed in the domain of "Vehicle Manufacturing". These patterns offer significant advantages in terms of flexibility, code organization, and clarity. By decoupling systems and promoting single responsibilities, they greatly enhance the scalability and maintainability of the codebase.

