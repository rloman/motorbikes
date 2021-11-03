package nl.motorbikes.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Will", "Bert");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
