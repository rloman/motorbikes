package nl.motorbikes.state.trafficlight;

public class TrafficLight {

	// current state
	State state;

	// possible state(s) (not current but they can be switched to)
	State redState;
	State orangeState;
	State greenState;

	public TrafficLight() {
		redState = new RedState(this);
		orangeState = new OrangeState(this);
		greenState = new GreenState(this);
		
		state = this.redState;
	}

	public void switchGreen() {
		state.switchGreen();
	}

	public void switchOrange() {
		state.switchOrange();
	}

	public void switchRed() {
		state.switchRed();
	}
}
