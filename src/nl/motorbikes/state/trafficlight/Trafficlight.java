package nl.designpatterns.state.trafficlight;

public class Trafficlight  {

	// current state
	private State state;

	// possible state(s)
	private State redState;
	private State orangeState;
	private State greenState;


	public Trafficlight() {
		redState = new RedState(this);
		orangeState = new OrangeState(this);
		greenState = new GreenState(this);
		
		state = this.getRedState();
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



	public State getRedState() {
		return redState;
	}



	public State getOrangeState() {
		return orangeState;
	}



	public State getGreenState() {
		return greenState;
	}



	public void setState(State state) {
		this.state = state;
	}
	

}
