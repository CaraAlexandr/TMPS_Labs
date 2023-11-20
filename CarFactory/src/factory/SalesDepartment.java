package factory;

// Concrete Observer
public class SalesDepartment implements FactoryObserver {
    @Override
    public void update(String message) {
        System.out.println("Sales Department notified: " + message);
    }
}
