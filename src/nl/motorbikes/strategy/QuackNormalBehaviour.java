package nl.motorbikes.strategy;

public class QuackNormalBehaviour implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack quack quack");

    }
}
