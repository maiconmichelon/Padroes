package command;

public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public CeilingFanOffCommand() {
	}
	
	@Override
	public void execute() {
		ceilingFan.on();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}

}
