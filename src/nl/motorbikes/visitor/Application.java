package nl.motorbikes.visitor;

public class Application {

    public static void main(String[] args) {

        Fruitbasket basket = new Fruitbasket();

        basket.add(new Banana());
        basket.add(new Apple());
        basket.add(new Pear());
        basket.add(new Apple());
        basket.add(new Banana());

        Visitor v = new FruitcountingVisitor();
        basket.accept(v);

        System.out.println(v.toString());
    }
}
