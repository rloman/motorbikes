package nl.motorbikes.command;

import nl.motorbikes.model.MotorFactory;
import nl.motorbikes.model.Vehicle;
import nl.motorbikes.model.VehicleFactory;

public class MotorDriveCommand implements Command {

    private VehicleFactory vehicleFactory = new MotorFactory();
    private Vehicle motor;

    public MotorDriveCommand() {
         this.motor = this.vehicleFactory.getVehicle();
    }

    @Override
    public void execute() {
        motor.drive();
    }
}
