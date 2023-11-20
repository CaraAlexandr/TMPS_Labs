package factory;

// Concrete Colleague
public class Inventory extends FactoryComponent {
    public Inventory(FactoryMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Inventory: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Inventory received: " + message);
    }
}
