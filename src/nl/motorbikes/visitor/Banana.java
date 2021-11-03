package nl.motorbikes.visitor;

public class Banana extends Fruit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
