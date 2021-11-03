package nl.motorbikes.templatemethod;

import nl.motorbikes.model.Vehicle;

public class Squad extends Vehicle {


    @Override
    public void drive() {
        System.out.println("Driving Squad");
    }
}
