package nl.motorbikes.state.gumball;

public class SoldOutState implements State {
	private GumballMachine machine;
	
	public SoldOutState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Machine sold out. You cannot insert a quarter");

	}

	@Override
	public void ejectQuarter() {

	}

	@Override
	public void turnCrank() {

	}

	@Override
	public void dispense() {

	}

	@Override
	public void refill(int balls) {
		this.machine.setCount(balls);
		this.machine.setState(this.machine.getNoQuarterState());
	}
}
