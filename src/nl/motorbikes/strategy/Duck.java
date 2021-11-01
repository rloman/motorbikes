package nl.motorbikes.strategy;

public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();
}
