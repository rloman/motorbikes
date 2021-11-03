package nl.motorbikes.visitor;

public interface Visitor {
    void visit(Fruitbasket fruitbasket);
    void visit(Apple apple);
    void visit(Banana banana);
    void visit(Pear pear);
    void visit(Ananas ananas);
}
