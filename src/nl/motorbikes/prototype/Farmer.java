package nl.motorbikes.prototype;


public abstract class Farmer implements Cloneable {

    public String name;
    public StringBuilder builder = new StringBuilder();

    // shallow
    @Override
    public Farmer clone() throws CloneNotSupportedException{

        // clone the object
        Farmer farmer = (Farmer) super.clone();

        // manually perform a deep copy of the builder.
        farmer.builder = new StringBuilder(builder.toString());

        return farmer;
    }
}

class ConcreteFarmer1 extends Farmer {
    @Override
    public Farmer clone() throws CloneNotSupportedException {
        return (ConcreteFarmer1)super.clone();
    }
}

class ConcreteFarmer2 extends Farmer {
    @Override
    public Farmer clone() throws CloneNotSupportedException {
        return (ConcreteFarmer2)super.clone();
    }
}