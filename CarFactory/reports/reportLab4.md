# Topic: Behavioral Design Patterns in Vehicle Manufacturing
## Author: Cara Alexandr
## Group: FAF-212

---

## Introduction
This report discusses the application of behavioral design patterns in the context of vehicle manufacturing. Three primary patterns have been explored: Strategy, Observer, and Mediator.

## Domain Overview
In the vehicle manufacturing domain, the process involves various components like production lines, quality control, logistics, and sales departments. Efficient communication and behavioral management among these components are crucial for seamless operations.

## Strategy Pattern
### Purpose
The Strategy Pattern enables an object to change its behavior at runtime by switching out one of many possible strategies.

### Implementation
In our vehicle manufacturing system, different vehicle assembly strategies are encapsulated within separate classes. A context class allows changing the vehicle assembly strategy dynamically, depending on the vehicle type.

```java
// Strategy Interface
public interface AssemblyStrategy {
    void assembleVehicle();
}

// Concrete Strategies
public class CarAssemblyStrategy implements AssemblyStrategy {
    public void assembleVehicle() {
        // Car assembly details
    }
}

public class TruckAssemblyStrategy implements AssemblyStrategy {
    public void assembleVehicle() {
        // Truck assembly details
    }
}

// Context
public class VehicleAssembler {
    private AssemblyStrategy strategy;

    public void setAssemblyStrategy(AssemblyStrategy strategy) {
        this.strategy = strategy;
    }

    public void assemble() {
        strategy.assembleVehicle();
    }
}
```

## Observer Pattern
### Purpose
The Observer Pattern provides a subscription mechanism to allow multiple objects to listen and react to events or state changes in another object.

### Implementation
In our domain, departments like Quality Control, Logistics, and Sales are observers that need to be notified when a new vehicle is produced. We implemented a `FactoryNotifier` as the subject, notifying all subscribed observers upon vehicle production.

```java
// Observer Interface
public interface FactoryObserver {
    void update(String message);
}

// Concrete Observers
public class QualityControl implements FactoryObserver {
    public void update(String message) {
        // React to the notification
    }
}

// Subject
public class FactoryNotifier {
    private final List<FactoryObserver> observers = new ArrayList<>();

    public void addObserver(FactoryObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (FactoryObserver observer : observers) {
            observer.update(message);
        }
    }
}
```

## Mediator Pattern
### Purpose
The Mediator Pattern reduces direct communication between objects by having them communicate instead through a mediator. This centralizes control and eases the maintenance of interactions between different components.

### Implementation
We introduced a `FactoryMediator` to manage interactions between different components like the Production Line, Inventory, and Quality Control Unit. This mediator centralizes communication, simplifying the interaction between these components.

```java
// Mediator Interface
public interface FactoryMediator {
    void sendMessage(String message, FactoryComponent component);
}

// Concrete Colleague
class ProductionLine extends FactoryComponent {
    public ProductionLine(FactoryMediator mediator) {
        super(mediator);
    }
    // Communication methods
}

// Concrete Mediator
public class FactoryMediatorImpl implements FactoryMediator {
    private ProductionLine productionLine;
    private Inventory inventory;
    // Registration and message passing logic
}
```

# Conclusion
Behavioral design patterns, namely Strategy, Observer, and Mediator, have been effectively integrated into our vehicle manufacturing system. These patterns bring enhanced flexibility, scalability, and clarity, facilitating better communication and behavior management among various components of the system. The ability to dynamically change strategies, notify relevant parties of changes, and centralize component interactions underlines the efficacy of these patterns in complex systems.

--- 

This explanation should fit well into your report, following the format of your previous section on structural design patterns.