package nl.motorbikes.state.trafficlight;

public class Application {

	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();
		
		light.switchOrange();
		light.switchGreen();
		light.switchRed();
		light.switchOrange();
		light.switchOrange();
		light.switchRed();
	}
}
