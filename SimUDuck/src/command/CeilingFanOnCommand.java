package command;

public class CeilingFanOnCommand implements Command {

	private CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		if(ceilingFan.getSpeed() == CeilingFan.HIGH)
			ceilingFan.high();
		if(ceilingFan.getSpeed() == CeilingFan.MEDIUM)
			ceilingFan.medium();
		if(ceilingFan.getSpeed() == CeilingFan.LOW)
			ceilingFan.low();
		if(ceilingFan.getSpeed() == CeilingFan.OFF)
			ceilingFan.off();
	}

}
