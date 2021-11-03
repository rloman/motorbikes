package nl.motorbikes.composite;

import nl.motorbikes.composite.reclist.RecList;

public class App {

    public static void main(String[] args) {
        RecList lijst = new RecList();
        lijst.add("Jeroen");
        lijst.add("Raymond");
        lijst.add("Francien");

        lijst.print();
    }
}
