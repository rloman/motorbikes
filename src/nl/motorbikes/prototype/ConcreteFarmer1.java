package nl.motorbikes.prototype;

public class ConcreteFarmer1 extends Farmer {
    @Override
    public Farmer clone() throws CloneNotSupportedException {
        return (ConcreteFarmer1) super.clone();
    }
}
