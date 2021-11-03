package nl.motorbikes.chain_of_responsibility;

public class NumberHandler implements Handler {

    private int number;
    private int hits;
    private Handler chain;

    private NumberHandler(int number) {
        this.number = number;
        number++;
        if(number <10) {
            chain = new NumberHandler(number);
        }
        else {
            chain = new NullHandler();
        }
    }

    public NumberHandler() {
        this(0);
    }

    public boolean handle(int number) {
        if(this.number == number) {
//            System.out.println("Handled a "+number+"!");
            hits++;

            return true;
        }
        else {
            return chain.handle(number);
        }
    }

    @Override
    public void handle(String numberAsString) {
        for(int i = 0;i<numberAsString.length();i++) {
            int getal = Integer.parseInt(numberAsString.substring(i, i+1));
            handle(getal);
        }
    }

    @Override
    public void show() {
        System.out.printf("Found %d occurrences of %d%n", hits, this.number);
        chain.show();
    }
}
