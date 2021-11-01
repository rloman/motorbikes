package nl.motorbikes.strategy;

public class SqueekBehaviour implements QuackBehaviour {


    @Override
    public void quack() {
        System.out.println("Squeek");
    }
}
