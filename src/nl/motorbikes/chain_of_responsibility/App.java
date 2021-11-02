package nl.motorbikes.chain_of_responsibility;

public class App {

    public static void main(String[] args) {

        Handler handler = new NumberHandler();
        handler.handle(4);
        handler.show();

        final String stringToBeHandled = "1234857428752943570243857209384";
        handler = new NumberHandler();
        handler.handle(stringToBeHandled);
        handler.show();

        handler = new OddEvenHandler();
        handler.handle(4);
        handler.handle(stringToBeHandled);

        handler.show();
    }
}
