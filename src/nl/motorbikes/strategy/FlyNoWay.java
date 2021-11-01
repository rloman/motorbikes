package nl.motorbikes.strategy;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am unable to fly");
    }
}
