package command;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[3];
		offCommands = new Command[3];
		
		Command noCommand = new NoCommand();
		for(int i = 0 ; i < onCommands.length ; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPressed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPressed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(){
		undoCommand.undo(); 
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" --------- REMOTE CONTROL ----------");
		
		for(int i = 0 ; i < onCommands.length ; i++){
			sb.append("[slot "+i+" ] " + onCommands[i].getClass().getName() + " > " + offCommands[i].getClass().getName());
		}
		return sb.toString();
	}
	
}
