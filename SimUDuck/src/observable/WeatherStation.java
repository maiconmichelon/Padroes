package observable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weather);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weather);
		
		weather.setMeasurements(80, 65, 32.4f);
		weather.setMeasurements(82, 70, 29.2f);
		weather.setMeasurements(78, 90, 29.2f);
		
	}
	
}
