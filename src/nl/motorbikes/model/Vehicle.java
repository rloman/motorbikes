package nl.motorbikes.model;

public abstract class Vehicle {

    private String merk;
    private int aantalWielen;

    public int getAantalWielen() {
        return aantalWielen;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    // template method
    public abstract void drive();
}
