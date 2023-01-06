package observer1;

public class WeatherStation {

	public static void main(String[]args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4F);
		weatherData.setMeasurements(70, 89, 11.2F);
		weatherData.setMeasurements(11, 50, 55.9F);
	}
}
