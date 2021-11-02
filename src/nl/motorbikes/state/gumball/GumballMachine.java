package nl.motorbikes.state.gumball;

public class GumballMachine {
	
	private State hasQuarterState;
	private State noQuarterState;
	private State soldOutState;
	private State soldState;
	
	private State state;
	
	private int count = 0;
	
	public GumballMachine(int initialGumballs) {
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		
		if(initialGumballs > 0) {
			this.count = initialGumballs;
			this.state = noQuarterState;
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if(count >= 0) {
			this.count = count;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
		
	}

	public void ejectQuarter() {
		state.ejectQuarter();
		
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void dispense() {
		state.dispense();
		
	}
	
	public void releaseBall() {
		if(this.count > 0) {
			System.out.println("A gumball comes rolling down the slot!");
			this.count --;
		}
	}
	
	public void refill(int balls) {
		this.state.refill(balls);
	}
}
