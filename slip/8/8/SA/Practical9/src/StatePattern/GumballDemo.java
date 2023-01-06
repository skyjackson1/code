package StatePattern;
import java.lang.*;

public class GumballDemo {

	public static void main(String args[])throws IllegalMonitorStateException{
		try {
			GumballMachine gum =new GumballMachine(4);
			gum.insertQuarter();
			gum.ejectQuarter();
			gum.equals(gum);
			gum.notify();
			gum.notifyAll();
			gum.refill(0);
			gum.toString();
		}
		catch(IllegalMonitorStateException e){
			System.out.print(false);	
		}
	}
}
