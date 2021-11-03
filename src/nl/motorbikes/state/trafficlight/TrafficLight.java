package nl.motorbikes.state.trafficlight;

public class TrafficLight {

	// current state
	State state;

	// possible state(s) (not current but they can be switched to)
	State redState;
	State orangeState;
	State greenState;
	State blinkState;

	public TrafficLight() {
		redState = new RedState(this);
		orangeState = new OrangeState(this);
		greenState = new GreenState(this);
		blinkState = new BlinkState(this);
		
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
	public void switchBlinking() {
		state.switchBlinking();
	}
}
