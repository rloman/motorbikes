package nl.motorbikes.state.trafficlight;

public class OrangeState implements State {
	
	private TrafficLight light;
	
	public OrangeState(TrafficLight light) {
		this.light = light;
	}

	@Override
	public void switchGreen() {
		System.out.println("The light has to become red first!");
	}

	@Override
	public void switchOrange() {
		System.out.println("Light is already orange!");

	}

	@Override
	public void switchRed() {
		System.out.println("Light switched to red.");
		this.light.state = this.light.redState;
	}

	@Override
	public void switchBlinking() {
		this.light.state = this.light.blinkState;
		System.out.println("Orange Light set to blinkstate");
	}
}
