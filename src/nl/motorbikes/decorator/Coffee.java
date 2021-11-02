package nl.motorbikes.decorator;

public class Coffee extends Beverage {

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
