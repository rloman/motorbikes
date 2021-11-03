package nl.motorbikes.strategy;

public class Application {

    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.display();

        d = new Rubberduck();
        d.display();
    }
}
