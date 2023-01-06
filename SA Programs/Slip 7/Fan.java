package CommandPattern;

public class Fan implements Command{
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public Fan(String location) {
		this.location = location;
		speed = OFF;
	}
	public Fan(Fan fan) {}
	public void high() {
		speed = HIGH;
	}
	public void medium() {
		speed = MEDIUM;
	}
	public void low() {
		speed = OFF;
	}
	public void off() {
		speed = OFF;
	}
	public int getSpeed() {
		return speed;
	}
	@Override
	public void execute(){}

}
