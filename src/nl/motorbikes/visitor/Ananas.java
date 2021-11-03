package nl.motorbikes.visitor;

import java.util.ArrayList;
import java.util.List;

public class Ananas extends Fruit {

    private List<Fruit> ananasFruits = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Fruit f : ananasFruits) {
            f.accept(visitor);
        }
    }
}
