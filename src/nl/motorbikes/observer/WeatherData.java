package nl.motorbikes.observer;

public class WeatherData extends Observable {

	int temperature;

	public void update(int newTemperature) {
		this.temperature = newTemperature;
		this.publish(temperature); // temperature is boxed to Integer (Object)
	}
}
