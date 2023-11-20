package factory;

// Concrete Observer
public class LogisticsDepartment implements FactoryObserver {
    @Override
    public void update(String message) {
        System.out.println("Logistics Department notified: " + message);
    }
}
