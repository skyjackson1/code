
import java.util.*;
import java.io.*;

public class singleton_lazyInit {
	private static singleton_lazyInit instance;
	private singleton_lazyInit() {}
	
	public static synchronized singleton_lazyInit getInstance() {
		if(instance==null) {
			instance = new singleton_lazyInit();
		}
		return instance;
	}

public static void main(String args[])
{
	System.out.println("Object Created");
}
}
