package nl.motorbikes.state.gumball;

public class Application {

	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(3);
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.turnCrank();
		machine.insertQuarter();
		machine.dispense();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.refill(2);
		machine.insertQuarter();
		System.out.println(machine.getCount());
		machine.turnCrank();
		System.out.println(machine.getCount());
	}

}
