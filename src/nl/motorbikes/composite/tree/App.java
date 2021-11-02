package nl.motorbikes.composite.tree;

public class App {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.add(5);
        t.add(1);
        t.add(3);

        t.print();
    }
}
