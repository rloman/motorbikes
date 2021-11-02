package nl.motorbikes.decorator;

public class Sugar extends CondimentDecorator {

    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
