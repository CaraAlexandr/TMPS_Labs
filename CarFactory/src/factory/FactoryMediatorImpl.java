package factory;

// Concrete Mediator
public class FactoryMediatorImpl implements FactoryMediator {
    private ProductionLine productionLine;
    private Inventory inventory;
    private QualityControlUnit qualityControlUnit;

    @Override
    public void sendMessage(String message, FactoryComponent component) {
        // Logic to determine who should receive the message
        if (component.equals(productionLine)) {
            if (inventory != null) {
                inventory.receive(message);
            }
            if (qualityControlUnit != null) {
                qualityControlUnit.receive(message);
            }
        } else if (component.equals(inventory)) {
            if (productionLine != null) {
                productionLine.receive(message);
            }
            if (qualityControlUnit != null) {
                qualityControlUnit.receive(message);
            }
        } else if (component.equals(qualityControlUnit)) {
            if (productionLine != null) {
                productionLine.receive(message);
            }
            if (inventory != null) {
                inventory.receive(message);
            }
        }
    }

    @Override
    public void registerComponent(FactoryComponent component) {
        if (component instanceof ProductionLine) {
            this.productionLine = (ProductionLine) component;
        } else if (component instanceof Inventory) {
            this.inventory = (Inventory) component;
        } else if (component instanceof QualityControlUnit) {
            this.qualityControlUnit = (QualityControlUnit) component;
        }
    }
}
