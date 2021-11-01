package nl.motorbikes.model;

public class InformatieToren {

    private static InformatieToren instance;
    private String name;

    private InformatieToren(String name) {
        this.name = name;
    }

    public static synchronized InformatieToren getInstance() {
        if (instance == null) {
            instance = new InformatieToren("Assen");
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    // deze is er meestal niet
    public void setName(String name) {
        this.name = name;
    }
}
