package nl.motorbikes.visitor;

public class FruitpriceCalculatingVisitor implements Visitor {

    private double cost;

    @Override
    public void visit(Fruitbasket fruitbasket) {
        fruitbasket.iterator().forEachRemaining(f -> {
            f.accept(this);
        });
    }

    @Override
    public void visit(Apple apple) {
        cost += 0.25;
    }

    @Override
    public void visit(Banana banana) {
        cost += 0.5;
    }

    @Override
    public void visit(Pear pear) {
        cost += 0.33;
    }

    @Override
    public void visit(Ananas ananas) {
        cost += 0.75;
    }

    @Override
    public String toString() {
        return "FruitpriceCalculatingVisitor{" +
                "cost=" + cost +
                '}';
    }
}
