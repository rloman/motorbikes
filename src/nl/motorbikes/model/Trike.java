package nl.motorbikes.model;

// Deze klasse dient voor de Builder pattern. (niet anders)
public class Trike extends Motor {

    // a lot of more (15+)
    private boolean isAllowedOnTheRoad;
    private boolean heeftTrekhaak;
    private String kettingKast;

    // 1. Private constructor
    private Trike(TrikeBuilder builder) {
        this.isAllowedOnTheRoad = builder.isAllowedOnTheRoad;
        this.heeftTrekhaak = builder.heeftTrekhaak;
        this.kettingKast = builder.kettingKast;
    }

    // getters en setters naar inzicht (van de Trike; het te maken model)
    public boolean isAllowedOnTheRoad() {
        return isAllowedOnTheRoad;
    }

    public void setAllowedOnTheRoad(boolean allowedOnTheRoad) {
        isAllowedOnTheRoad = allowedOnTheRoad;
    }

    public boolean isHeeftTrekhaak() {
        return heeftTrekhaak;
    }

    public void setHeeftTrekhaak(boolean heeftTrekhaak) {
        this.heeftTrekhaak = heeftTrekhaak;
    }

    public String getKettingKast() {
        return kettingKast;
    }

    public void setKettingKast(String kettingKast) {
        this.kettingKast = kettingKast;
    }

    // static inner class want anders werkt het niet,
    // want ik heb immers nog geen Trike instantie.
    public static class TrikeBuilder {

        private boolean isAllowedOnTheRoad;
        private boolean heeftTrekhaak = false;
        private String kettingKast = "Rood";

        // Constructor voor de verplichte velden (in the Trike)
        public TrikeBuilder(boolean isAllowedOnTheRoad) {
            this.isAllowedOnTheRoad = isAllowedOnTheRoad;
        }

        // flluent api methods
        // elk field van de Trike (en corresponderende builder) krijgt
        // with... method
        public TrikeBuilder withHeeftTrekhaak(boolean heeftTrekhaak) {
            this.heeftTrekhaak = heeftTrekhaak;

            return this;
        }

        public TrikeBuilder withKettingkast(String kettingKast) {
            this.kettingKast = kettingKast;

            return this;
        }

        public Trike build() {
            return new Trike(this);
        }
    }
}
