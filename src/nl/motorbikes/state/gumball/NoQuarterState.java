package nl.designpatterns.state.gumball;

public class NoQuarterState implements State {
	
	private GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		this.machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter!");

	}

	@Override
	public void turnCrank() {
		System.out.println("Please insert quarter first!");

	}

	@Override
	public void dispense() {

	}
	
	@Override
	public void refill(int balls) {
		System.out.println("Can only refill if sold out.");
	}

}
