package nl.motorbikes.observer;

public class Application {

	public static void main(String[] args) {
		
		
		WeatherData data = new WeatherData();
		
		new WeatherStation(data);
		WeatherStation victim = new WeatherStation(data);
		
		data.update(33);
		
		data.unsubscribe(victim);
		System.out.println("deleted one");
		
		data.update(35);
		
		
	}
}
