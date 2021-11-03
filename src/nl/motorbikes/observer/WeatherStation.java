package nl.motorbikes.observer;

public class WeatherStation implements Observer {

	public WeatherStation(WeatherData obs) {
		obs.subscribe(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		if (observable instanceof WeatherData && object instanceof Integer) {
			Integer temp = (Integer) object;
			System.out.println("I am a weatherstation: temperature is " + temp);

		}
	}
}
