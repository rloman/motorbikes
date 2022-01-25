package nl.motorbikes.factorymethod;

import nl.motorbikes.model.MotorFactory;

public class Application {

    public static void main(String[] args) {

        Shop shop = new Shop(new MotorFactory());
        shop.buy(3);
        shop.sell();
    }
}
