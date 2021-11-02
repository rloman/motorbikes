package nl.motorbikes.state.gumball;

public interface State {
	
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	void refill(int balls);
	
	

}
