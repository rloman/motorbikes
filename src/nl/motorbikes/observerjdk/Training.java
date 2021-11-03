package nl.motorbikes.observerjdk;

import java.time.LocalDateTime;

public class Training {

    private LocalDateTime when;
    private double km;

    public Training(LocalDateTime when, double km) {
        this.when = when;
        this.km = km;
    }

    public Training(double km) {
        this(LocalDateTime.now(), km);
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public double getKm() {
        return km;
    }
}
