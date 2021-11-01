package nl.motorbikes.abstracting;

import nl.motorbikes.model.Vehicle;

import java.util.Iterator;

public class Samsung extends Vehicle implements Televisie, Iterable<String>, Comparable {


    @Override
    public void foo() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
