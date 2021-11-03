package nl.motorbikes.model;

public class Motor extends Vehicle {

    /* default access // package private */
    Motor() {

    }

    @Override
    public void drive() {
        System.out.println("Driving motor!");
    }
}
