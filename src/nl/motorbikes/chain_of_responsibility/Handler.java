package nl.motorbikes.chain_of_responsibility;

public interface Handler {

    void handle(String number);
    void show();
    boolean handle(int number);
}
