package nl.motorbikes.observerjdk;

import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;

public class DailyLoggingStation implements Observer  {


    public DailyLoggingStation(TrainingData trainingData) {
        trainingData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof TrainingData) {
            TrainingData d = (TrainingData) o;
            d.getTrainings().forEach(training -> {
                if (LocalDate.now().equals(training.getWhen().toLocalDate())) {
                    System.out.println("You have run today, great!");
                }
            });
        }
    }
}
