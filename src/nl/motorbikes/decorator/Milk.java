package nl.motorbikes.decorator;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.25 + this.beverage.cost();
    }
}
