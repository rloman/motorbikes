package nl.motorbikes.abstractfactory;

import nl.motorbikes.model.Motor;
import nl.motorbikes.model.Vehicle;
import nl.motorbikes.model.VehicleFactory;

public class Application {

    public static void main(String[] args) {
        Vehicle m = VehicleFactory.getVehicle("motor");


    }
}
