package nl.motorbikes.chain_of_responsibility;

public class App {

    public static void main(String[] args) {
        final NumberHandler handler = new NumberHandler();
        handler.handle(4);
        String tobeHandled = "1234857428752943570243857209384";
        handler.handle(tobeHandled);

        handler.show();
    }
}
