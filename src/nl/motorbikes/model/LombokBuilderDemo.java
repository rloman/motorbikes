package nl.motorbikes.model;

// Kijk, je kunt met Lokbok dus met 1 regel een bulider maken (zie ook Lombokbok)
public class LombokBuilderDemo {

    public static void main(String[] args) {
        Lombokbok bok = Lombokbok.builder().age(33).name("Fred").build();
    }
}
