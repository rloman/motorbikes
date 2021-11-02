package nl.motorbikes.iterator.primes;

import java.util.Iterator;

public class PrimeNumberIterator implements Iterator<Integer> {

    private int prime = 2;
    private int max = 2;


    public PrimeNumberIterator(int max) {
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return prime < max;
    }

    @Override
    public Integer next() {
        return null;
    }

    private int getNextPrime() {

    }
}
