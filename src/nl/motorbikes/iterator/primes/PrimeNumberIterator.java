package nl.motorbikes.iterator.primes;

import java.util.Iterator;

public class PrimeNumberIterator implements Iterator<Integer> {

    /**
     * The next prime to be returned by this iterator's next method.
     */
    private int nextPrime;
    private int maxPrime = 2;

    /**
     * Creates an iterator over all of the prime numbers.
     */

    public PrimeNumberIterator(int max) {
        nextPrime = 2;
        this.maxPrime = max;
    }

    /**
     * Sets <CODE>nextPrime</CODE> to the smallest prime number less than
     * the given integer.
     *
     * @param n an integer
     */

    private void setNextPrime(int n) {
        if (n < 2) {
            nextPrime = 2;
        } else {
            int candidate = n + 1;

            // ensure candidate is odd

            if (candidate % 2 == 0)
                candidate++;

            while (!isPrime(candidate))
                candidate += 2;

            nextPrime = candidate;
        }
    }

    /**
     * Determines if the given odd integer is prime.
     *
     * @param n an odd integer strictly greater than 1
     */

    private boolean isPrime(int n) {
        // search for odd factors between 3 and sqrt(n)

        int factor = 3;

        while (factor * factor <= n && n % factor > 0)
            factor += 2;

        return (factor * factor > n);
    }

    /**
     * Returns the next prime number in this iteration.
     *
     * @return the next prime number in this iteration
     */

    public Integer next() {
        int prime = nextPrime;

        setNextPrime(nextPrime);

        return prime;
    }

    /**
     * Determines if there is a next prime in this iteration.
     * This implementation returns true even though there is a bound on the
     * value of an <CODE>Integer</CODE>.
     *
     * @return true
     */

    public boolean hasNext() {
        return this.nextPrime <= this.maxPrime;
    }
}
