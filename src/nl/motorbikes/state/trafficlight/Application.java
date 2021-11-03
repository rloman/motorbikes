package nl.motorbikes.state.trafficlight;

public class Application {

	public static void main(String[] args) {
		// default, the light is red
		TrafficLight light = new TrafficLight();
		
		light.switchOrange();
		light.switchGreen();
		light.switchRed();
		light.switchOrange();
		light.switchOrange();
		light.switchRed();

		light.switchBlinking();
		light.switchGreen();
		light.switchBlinking();
	}
}
