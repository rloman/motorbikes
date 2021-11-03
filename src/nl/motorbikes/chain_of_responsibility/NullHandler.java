package nl.motorbikes.chain_of_responsibility;

public class NullHandler implements Handler  {

    @Override
    public void show() {
    }

    @Override
    public void handle(String number) {
    }

    @Override
    public boolean handle(int number) {
        return false;
    }
}
