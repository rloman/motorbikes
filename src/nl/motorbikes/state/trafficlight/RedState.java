package nl.motorbikes.state.trafficlight;

public class RedState implements State {

	private TrafficLight light;
	
	public RedState(TrafficLight light) {
		this.light = light;
	}
	
	@Override
	public void switchGreen() {
		System.out.println("Light switched to green");
		this.light.state = this.light.greenState;

	}

	@Override
	public void switchOrange() {
		System.out.println("We are not a German trafficlight! :-)");
	}

	@Override
	public void switchRed() {
		System.out.println("Light is already red.");

	}

}
