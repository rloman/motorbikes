package nl.motorbikes.templatemethod;

import nl.motorbikes.model.Vehicle;

import java.util.List;

public final class VehicleTester {

    public static void testVehicles(List<Vehicle> vehicles) {

        for (Vehicle v : vehicles) {
            v.drive();
        }
    }

}
