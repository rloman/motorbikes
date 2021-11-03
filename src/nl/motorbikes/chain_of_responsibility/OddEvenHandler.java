package nl.motorbikes.chain_of_responsibility;

public class OddEvenHandler implements Handler {

    private int odd;
    private int even;

    private Handler chain = new NumberHandler();


    @Override
    public void handle(String number) {
        System.out.printf("Length: %d%n", number.length());
        for (int i = 0; i < number.length(); i++) {
            int n = Integer.parseInt("" + number.charAt(i));
            handle(n);
        }
    }

    @Override
    public void show() {
        System.out.printf("Odd: %d, Even: %d%n", this.odd, this.even);
        this.chain.show();
    }

    @Override
    public boolean handle(int number) {

        if (number % 2 == 0) {
            this.even++;
        }
        else {
            this.odd++;
        }

        return this.chain.handle(number);
    }
}
