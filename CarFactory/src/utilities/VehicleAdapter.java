package utilities;

public class VehicleAdapter {
    private TPMS tpms;

    public VehicleAdapter(TPMS tpms) {
        this.tpms = tpms;
    }

    public double getVehicleTirePressure() {
        return tpms.getTirePressure();
    }
}
