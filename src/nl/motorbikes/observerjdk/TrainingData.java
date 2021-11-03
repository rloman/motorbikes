package nl.motorbikes.observerjdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class TrainingData extends Observable {

    private List<Training> trainings = new ArrayList<>();

    public void addTraining(Training training) {
        this.trainings.add(training);
        this.setChanged();
        this.notifyObservers();
    }

    public Iterable<Training> getTrainings() {
        return trainings;
    }
}
