package command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLigh = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command kitchenOn = new LightOnCommand(kitchenLigh);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		Command KitchenLightOff = new LightOffCommand(kitchenLigh);
		
		Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		rc.setCommand(1, kitchenOn, KitchenLightOff);
		rc.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		
		System.out.println(rc.toString());
		
		rc.onButtonPressed(0);
		rc.undoButtonWasPushed();
		rc.offButtonPressed(0);
		rc.undoButtonWasPushed();
		rc.onButtonPressed(1);
		rc.undoButtonWasPushed();
		rc.offButtonPressed(1);
		rc.undoButtonWasPushed();
		rc.onButtonPressed(2);
		rc.undoButtonWasPushed();
		rc.offButtonPressed(2);
		rc.undoButtonWasPushed();
		
	}
	
}
