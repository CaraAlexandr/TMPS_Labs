
package factory;

// Mediator interface
public interface FactoryMediator {
    void sendMessage(String message, FactoryComponent component);
    void registerComponent(FactoryComponent component);
}

