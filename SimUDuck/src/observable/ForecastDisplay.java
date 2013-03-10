package observable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{

	private float temp;
	private float humidity;
	private float pressure;
	private final Observable observable;
	
	public ForecastDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}		

	@Override
	public void update(Observable obs, Object arg1) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			temp = weatherData.getTemp();
			humidity = weatherData.getHumidity();
			pressure = weatherData.getPressure();
			
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("");
	}

}
