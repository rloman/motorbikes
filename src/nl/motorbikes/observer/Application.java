package nl.motorbikes.observer;

public class Application {

	public static void main(String[] args) {
		
		
		WeatherData data = new WeatherData();

		// Kijk, het Weatherstation is anoniem. , toch krijgt ie straks updates!
		new WeatherStation(data);
		WeatherStation victim = new WeatherStation(data);
		
		data.update(33);
		
		data.unsubscribe(victim);
		data.update(35);
	}
}
