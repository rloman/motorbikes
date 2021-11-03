package nl.motorbikes.iterator.primes;

public class App {

    public static void main(String[] args) {

        System.out.println("== Using Iterator interface");
        PrimeNumberIterator i = new PrimeNumberIterator(100);
        for (PrimeNumberIterator it = i; it.hasNext(); ) {
            int prime = it.next();
            System.out.println(prime);
        }

        System.out.println("== Using Iterable interface");
        // when implementing the Iterable we can also loop over it using the for each loop construct
        for (int prime : new PrimeNumberIterator(50)) {
            System.out.println(prime);
        }
    }
}
