package decorator;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecoratorClient {
	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in = new InputStreamDecorator(new BufferedInputStream(new FileInputStream("/Users/sanjeevkumar/Desktop/Decorator.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		}
        catch (IOException e) {
        	e.printStackTrace();
        }
	}
}