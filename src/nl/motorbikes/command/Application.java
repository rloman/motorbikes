package nl.motorbikes.command;

public class Application {

	public static void main(String[] args) {
		
		SimpleRemoteControl control = new SimpleRemoteControl();

		control.setCommand(new LightOnCommand(new Light()));
		control.buttonPressed();
		
		control.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
		control.buttonPressed();

		// implement the command StartMotorCommand here
		control.setCommand(new MotorDriveCommand());
		control.buttonPressed();
	}
}
