package nl.motorbikes.observer;

public class WeatherData extends Observable {

	int temperature;

	public void update(int newTemperature) {
		this.temperature = newTemperature;
		this.publish(new Integer(temperature));
	}

}
