package nl.motorbikes.builder;

import nl.motorbikes.model.Trike;

public class Application {

    public static void main(String[] args) {

        {
            // lang van stof
            Trike.TrikeBuilder trikeBuilder = new Trike.TrikeBuilder(true);
            trikeBuilder.withKettingkast("Rood");
            trikeBuilder.withHeeftTrekhaak(false);

            Trike trike = trikeBuilder.build();

            System.out.println(trike.getKettingKast());
        }
        {
            // korter van stof
            Trike.TrikeBuilder trikeBuilder = new Trike.TrikeBuilder(true)
                    .withKettingkast("Rood")
                    .withHeeftTrekhaak(false);

            Trike trike = trikeBuilder.build();

            System.out.println(trike.getKettingKast());
        }
        {
            // korts van stof
            Trike trike = new Trike.TrikeBuilder(true)
                .withKettingkast("Rood")
                .withHeeftTrekhaak(false)
                    .build();

            System.out.println(trike.getKettingKast());
        }
    }
}
