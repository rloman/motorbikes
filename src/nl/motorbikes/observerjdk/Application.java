package nl.motorbikes.observerjdk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application {

    public static void main(String[] args) {

        TrainingData trainingData = new TrainingData();
        new DailyLoggingStation(trainingData);
        new WeekcounterStation(trainingData);

        trainingData.addTraining(new Training(10));
        trainingData.addTraining(new Training(LocalDateTime.of(LocalDate.now().minusDays(3), LocalTime.of(11,12)), 14));
    }
}
