package nl.motorbikes.state.trafficlight;

public interface State {
	void switchGreen();
	void switchOrange();
	void switchRed();
	void switchBlinking();
}
