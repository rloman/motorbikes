package nl.motorbikes.state.gumball;

public class HasQuarterState implements State {
	
	private GumballMachine machine;
	
	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You already inserted a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter ejected");
		this.machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned crank!");
		machine.setState(machine.getSoldState());
		machine.dispense();
		
	}

	@Override
	public void dispense() {
		System.out.println("You have to turn the crank first!");
		
	}
	
	@Override
	public void refill(int balls) {
		System.out.println("Can only refill if sold out.");
	}

}
