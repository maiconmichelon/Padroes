package command;

public class RemoteControlTeste {

	public static void main(String[] args) {
		SimpleRemoteControl src = new SimpleRemoteControl();
		GarageOpenDoorCommand godc = new GarageOpenDoorCommand();
		godc.setGarageDoor(new GarageDoor());
		LightOnCommand lightOn = new LightOnCommand(new Light());
		
		src.setSlot(godc);
		src.buttonWasPressed();
		src.setSlot(lightOn);
		src.buttonWasPressed();
	}
	
}
