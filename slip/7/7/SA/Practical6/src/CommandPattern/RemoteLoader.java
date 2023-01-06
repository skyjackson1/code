package CommandPattern;

public class RemoteLoader {

	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		System.out.println("Living Room");
		Fan ceilingFan = new Fan("Living Room");
		
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(Fan);
		System.out.println("Fan speed is medium");
		
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(Fan);
		System.out.println("Fan speed is high");
		
		Fan ceilingFanOFF = new Fan(ceilingFan);
		System.out.println("Fan is turned off");
	}
	
}
