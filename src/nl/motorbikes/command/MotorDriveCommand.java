package nl.motorbikes.command;

import nl.motorbikes.model.Vehicle;
import nl.motorbikes.model.VehicleFactory;

public class MotorDriveCommand implements Command {

    private Vehicle motor = VehicleFactory.getVehicle("motor");

    @Override
    public void execute() {
        motor.drive();
    }
}
