package utilities;

public class VehiclePreparationFacade {
    public void prepareForDelivery() {
        testVehicle();
        paintVehicle();
        addAccessories();
    }

    private void testVehicle() {
        System.out.println("Testing the vehicle...");
    }

    private void paintVehicle() {
        System.out.println("Painting the vehicle...");
    }

    private void addAccessories() {
        System.out.println("Adding accessories...");
    }
}
