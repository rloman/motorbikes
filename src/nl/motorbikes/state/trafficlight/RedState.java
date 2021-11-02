package nl.motorbikes.state.trafficlight;

public class RedState implements State {

	private Trafficlight light;
	
	public RedState(Trafficlight light) {
		this.light = light;
	}
	
	@Override
	public void switchGreen() {
		System.out.println("Light switched to green");
		this.light.setState(this.light.getGreenState());

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
