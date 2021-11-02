package nl.motorbikes.decorator;

public class Coffee extends Beverage {

    public Coffee() {
        this.description = "Coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
