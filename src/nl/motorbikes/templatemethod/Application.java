package nl.motorbikes.templatemethod;

import nl.motorbikes.model.Motor;
import nl.motorbikes.model.Trike;
import nl.motorbikes.model.Vehicle;
import nl.motorbikes.model.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(VehicleFactory.getVehicle("motor"));
        vehicles.add(new Squad());
        vehicles.add(new Trike.TrikeBuilder(true).build());

        VehicleTester.testVehicles(vehicles);
    }
}
