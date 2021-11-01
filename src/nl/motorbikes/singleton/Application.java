package nl.motorbikes.singleton;

import nl.motorbikes.model.InformatieToren;

public class Application {

    public static void main(String[] args) {

        InformatieToren one = InformatieToren.getInstance();
        InformatieToren two = InformatieToren.getInstance();

        System.out.println(one.getName());
        System.out.println(two.getName());

        one.setName("Utrecht");
        System.out.println(two.getName());

    }


}
