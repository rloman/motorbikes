package nl.motorbikes.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fruitbasket extends Fruit implements Iterable<Fruit> {

    private List<Fruit> content = new ArrayList<>();

    public boolean add(Fruit fruit) {
        return content.add(fruit);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Iterator<Fruit> iterator() {
        return this.content.iterator();
    }
}
