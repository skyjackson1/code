package CommandPattern;

public class RemoteControl {

	Command[] onCommand;
	Command[] offCommand;
	Command[] undoCommand;
	
	public RemoteControl() {
		
		onCommand = new Command[7];
		offCommand = new Command[7];
		Command noCommand = new NoCommand();
		
		for(int i=0; i<7, i++) {
			onCommand[i] = noCommand; 
			offCommand[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	public void setCommand(int slot, Command ceilingFanMedium, Command ceilingFanOff) {
		onCommand[slot] = ceilingFanMedium;
		offCommand[slot] = ceilingFanOff;
	}
	public void onButtonWasPushed(int slot) {
		onCommand[slot].execute();
		undoCommand = onCommand[slot];
	}
	public void offButtonWasPushed(int slot) {
		offCommand[slot].execute();
		undoCommand = offCommand[slot];
	}
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	public void setCommand(int slot, CeilingFanMediumCommand ceilingFanMedium, CeilingFan ceilingFanOff) {}
	public void setCommand(int slot, CeilingFanHighCommand ceilingFanHigh, CeilingFan ceilingFanOff) {}