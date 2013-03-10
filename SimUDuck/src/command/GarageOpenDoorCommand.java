package command;

public class GarageOpenDoorCommand implements Command{

	GarageDoor garageDoor;
	
	public void setGarageDoor(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.open();
	}

}
