package nl.motorbikes.strategy;

public class Rubberduck extends Duck {

    public Rubberduck() {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new SqueekBehaviour());
    }

    @Override
    public void display() {
        this.fly();
        this.quack();
    }
}
