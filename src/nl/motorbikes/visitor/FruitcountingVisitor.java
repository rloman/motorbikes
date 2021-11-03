package nl.motorbikes.visitor;

public class FruitcountingVisitor implements Visitor {

    private int apples;
    private int pears;
    private int bananas;
    private int ananas;

    @Override
    public void visit(Fruitbasket fruitbasket) {
        for (Fruit fruit : fruitbasket) {
            fruit.accept(this);
        }
    }

    @Override
    public void visit(Apple apple) {
        apples++;
    }

    @Override
    public void visit(Banana banana) {
        bananas++;
    }

    @Override
    public void visit(Pear pear) {
        pears++;
    }

    @Override
    public void visit(Ananas ananas) {
        this.ananas++;
    }

    @Override
    public String toString() {
        return "FruitcountingVisitor{" +
                "apples=" + apples +
                ", pears=" + pears +
                ", bananas=" + bananas +
                ", ananas=" + ananas +
                '}';
    }
}
