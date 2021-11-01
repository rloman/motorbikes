package nl.motorbikes.model;

public final class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if ("motor".equals(type)) {
            return new Motor();
        }
        else {
            return null;
        }
    }
}
