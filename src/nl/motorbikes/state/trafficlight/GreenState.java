package nl.motorbikes.state.trafficlight;

public class GreenState implements State {
	
	private TrafficLight trafficLight;
	
	public GreenState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void switchGreen() {
		System.out.println("Light is already green!");
	}

	@Override
	public void switchOrange() {
		trafficLight.state = this.trafficLight.orangeState;
		System.out.println("Light switched to orange!");

	}

	@Override
	public void switchRed() {
		System.out.println("First switch the light to orange");
	}

	@Override
	public void switchBlinking() {
		this.trafficLight.state = this.trafficLight.blinkState;
		System.out.println("Trafflight is blinking now!");
	}

}
