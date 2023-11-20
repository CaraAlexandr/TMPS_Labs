package factory;

// Concrete Colleague
public class QualityControlUnit extends FactoryComponent {
    public QualityControlUnit(FactoryMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Quality Control Unit: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Quality Control Unit received: " + message);
    }
}
