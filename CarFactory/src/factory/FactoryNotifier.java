package factory;

import java.util.ArrayList;
import java.util.List;

// Subject
public class FactoryNotifier {
    private final List<FactoryObserver> observers = new ArrayList<>();
    private String message;

    public void addObserver(FactoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FactoryObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (FactoryObserver observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
