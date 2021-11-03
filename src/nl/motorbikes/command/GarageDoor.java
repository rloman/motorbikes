package nl.motorbikes.command;

public class GarageDoor {

    private boolean open = false;

    public void open() {
        this.open = true;
    }

    public void close() {
        this.open = false;
    }

    public void showStatus() {
        System.out.printf("The door is %s%n", this.open ? "open" : "closed");
    }

}
