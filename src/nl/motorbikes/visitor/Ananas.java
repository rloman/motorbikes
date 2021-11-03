package nl.motorbikes.visitor;

public class Ananas extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
