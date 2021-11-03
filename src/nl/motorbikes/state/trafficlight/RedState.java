package nl.motorbikes.state.trafficlight;

public class RedState implements State {

	private TrafficLight light;
	
	public RedState(TrafficLight light) {
		this.light = light;
	}
	
	@Override
	public void switchGreen() {
		this.light.state = this.light.greenState;
		System.out.println("Light switched to green. Drive!");
	}

	@Override
	public void switchOrange() {
		System.out.println("We are not a German trafficlight! :-)");
	}

	@Override
	public void switchRed() {
		System.out.println("Light is already red.");
	}

	@Override
	public void switchBlinking() {
		System.out.println("First set light to green to allow waiters to drive");
		System.out.println("Then set light to blinking");
	}
}
