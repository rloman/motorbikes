package nl.motorbikes.command;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor door) {
		this.garageDoor = door;
	}

	@Override
	public void execute() {
		garageDoor.open();
		garageDoor.showStatus();
	}
}
