package factory;

// Concrete Observer
public class QualityControl implements FactoryObserver {
    @Override
    public void update(String message) {
        System.out.println("Quality Control Department notified: " + message);
    }
}
