package CommandPattern;

public class RemoteControlTest {

	
	public static void main(String args[]) throws Exception{
		
		Car car = new Car();
		RemoteControl remoteControl = new RemoteControl();
		RotatingTop top= new RotatingTop();
		
		System.out.println("---------Testing onButtonPressed on RemoteControl for Car-----------");
		CommandBase carMoveCommand = new CarMoveCommand(car);
		remoteControl.onButtonPressed(carMoveCommand);
		
		System.out.println("---------Testing offButtonPressed on RemoteControl for Car-----------");
		CommandBase carStopCommand = new CarStopCommand(car);
		remoteControl.offButtonPressed(carStopCommand);
		
		System.out.println("---------Testing undoButtonPressed on RemoteControl for Car-----------");
		remoteControl.undoButtonPressed();
		
		System.out.println("---------Testing onButtonPressed on RemoteControl for RotatingTop-----------");
		CommandBase topRotateCommand = new TopRotateCommand(top);
		remoteControl.onButtonPressed(topRotateCommand);
		
		System.out.println("---------Testing undoButtonPressed on RemoteControl for RotatingTop-----------");
		remoteControl.undoButtonPressed();
	}
	
}
