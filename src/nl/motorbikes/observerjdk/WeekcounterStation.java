package nl.motorbikes.observerjdk;

import java.time.LocalDateTime;
import java.util.Observable;
import java.util.Observer;

public class WeekcounterStation implements Observer  {


    public WeekcounterStation(TrainingData trainingData) {
        trainingData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof TrainingData) {
            TrainingData d = (TrainingData) o;
            double totalKms = 0;
            for (Training training : d.getTrainings()) {
                if (LocalDateTime.now().minusWeeks(1).isBefore(training.getWhen())) {
                    totalKms += training.getKm();
                }
            }
            System.out.printf("This week you have run %.02f kms%n", totalKms);
        }
    }
}
