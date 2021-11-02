package nl.motorbikes.decorator;

public class App {

    public static void main(String[] args) {

        Beverage beverage = new Milk(new Sugar(new Coffee()));
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
