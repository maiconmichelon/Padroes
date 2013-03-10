package observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer{

	private float temp;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable){
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg1) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("A temperatura é de "+ temp + " enquanto a humidade esta à "+ humidity + "%");
	}

}
