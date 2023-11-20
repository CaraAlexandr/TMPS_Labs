package factory;

// Concrete Colleague
public class ProductionLine extends FactoryComponent {
    public ProductionLine(FactoryMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Production Line: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Production Line received: " + message);
    }
}
