package factory;

// Colleague abstract class
abstract class FactoryComponent {
    protected FactoryMediator mediator;

    public FactoryComponent(FactoryMediator mediator) {
        this.mediator = mediator;
    }

    abstract void send(String message);

    abstract void receive(String message);
}
