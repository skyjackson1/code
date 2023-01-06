package CommandPattern;

public class CeilingFanHighCommand implements Command{

	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
	public void undo() {
		if(prevSpeed == Fan.HIGH) {
			ceilingFan.high();
		}
		else if(prevSpeed == Fan.MEDIUM) {
			ceilingFan.medium();
		}
		else if(prevSpeed == Fan.LOW) {
			ceilingFan.low();
		}
		else if(prevSpeed == Fan.OFF) {
			ceilingFan.off();
		}
	}
	
}
