package nl.motorbikes.templatemethod;

import nl.motorbikes.model.*;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new MotorFactory().getVehicle());
        vehicles.add(new Squad());
        vehicles.add(new Trike.TrikeBuilder(true).build());

        VehicleTester.testVehicles(vehicles);
    }
}
