package nl.motorbikes.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehaviour(new FlyWithWings());
        this.setQuackBehaviour(new QuackNormalBehaviour());
    }

    @Override
    public void display() {
        this.fly();
        this.quack();
    }
}
