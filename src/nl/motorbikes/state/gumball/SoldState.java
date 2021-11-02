package nl.motorbikes.state.gumball;

public class SoldState implements State {
	private GumballMachine machine;
	
	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Wait a second ... you are getting a gumball.");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank.");

	}

	@Override
	public void turnCrank() {
		System.out.println("You alread turned the crank. ");

	}

	@Override
	public void dispense() {
		this.machine.releaseBall();
		if(machine.getCount() > 0) {
			this.machine.setState(machine.getNoQuarterState());
		}
		else {
			System.out.println("Oops ... out of gumballs");
			machine.setState(machine.getSoldOutState());
		}

	}
	
	@Override
	public void refill(int balls) {
		System.out.println("Can only refill if sold out.");
	}

}
