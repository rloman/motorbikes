package nl.motorbikes.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

	 List<Observer> observers = new ArrayList<Observer>();

	 void publish(Object data) {
		for (Observer obs : this.observers) {
			obs.update(this,data);
		}
	}
	
	public void subscribe(Observer obs) {
		this.observers.add(obs);
	}
	
	public void unsubscribe(Observer obs) {
		this.observers.remove(obs);
		System.out.println("deleted one observer with hash => "+obs.hashCode());
	}
}
