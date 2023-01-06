package CommandPattern;
import java.util.List;

public class LightOffCommand{

	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
	public void undo() {
		light.on();
	}
	
}
