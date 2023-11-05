package models;

import java.util.ArrayList;
import java.util.List;

public class VehicleFleet extends VehicleComponent {
    private List<VehicleComponent> components = new ArrayList<>();

    @Override
    public void add(VehicleComponent component) {
        components.add(component);
    }

    @Override
    public void remove(VehicleComponent component) {
        components.remove(component);
    }

    @Override
    public VehicleComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public void displayDetails() {
        for (VehicleComponent component : components) {
            component.displayDetails();
        }
    }
}
