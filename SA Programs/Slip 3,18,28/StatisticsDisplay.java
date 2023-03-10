package observer1;

public class StatisticsDisplay implements Observer, DisplayElement{
	
	private float maxTemp = 0.0F;
	private float minTemp = 200;
	private float tempSum = 0.0F;
	private int numReadings;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		
		tempSum += temp;
		numReadings++;
		
		if(temp>maxTemp) {
			maxTemp = temp;
		}
		if(temp<minTemp) {
			minTemp = temp;
		}
		display();
	}
	public void display() {
		System.out.println("Avg/Max/Min temperatrure = "+(tempSum/numReadings)+"/"+maxTemp+"/"+minTemp);
	}
}
