package models;

public abstract class VehicleComponent {
    public void add(VehicleComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(VehicleComponent component) {
        throw new UnsupportedOperationException();
    }

    public VehicleComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void displayDetails() {
        throw new UnsupportedOperationException();
    }
}
