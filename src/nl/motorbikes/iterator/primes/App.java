package nl.motorbikes.iterator.primes;

public class App {

    public static void main(String[] args) {

        PrimeNumberIterator i = new PrimeNumberIterator(100);
        for (PrimeNumberIterator it = i; it.hasNext(); ) {
            int prime = it.next();
            System.out.println(prime);
        }
    }
}
