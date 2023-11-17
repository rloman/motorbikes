package nl.motorbikes.prototype;

public class ConcreteFarmer2 extends Farmer {
    @Override
    public Farmer clone() throws CloneNotSupportedException {
        return (ConcreteFarmer2) super.clone();
    }
}
