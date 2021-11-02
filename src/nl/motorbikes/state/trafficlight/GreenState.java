package nl.designpatterns.state.trafficlight;

public class GreenState implements State {
	
	private Trafficlight light;
	
	public GreenState(Trafficlight light) {
		this.light = light;
	}

	@Override
	public void switchGreen() {
		System.out.println("Light is already green!");
	}

	@Override
	public void switchOrange() {
		light.setState(this.light.getOrangeState());
		System.out.println("Light switched to orange!");

	}

	@Override
	public void switchRed() {
		System.out.println("First switch the light to orange");

	}

}
