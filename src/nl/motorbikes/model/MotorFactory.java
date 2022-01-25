package nl.motorbikes.model;

public class MotorFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle() {
        return new Motor();
    }
}
