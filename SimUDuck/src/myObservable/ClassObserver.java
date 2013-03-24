package myObservable;

import java.util.Observable;
import java.util.Observer;

public class ClassObserver implements Observer{

	public void addObservable(Observable observable){
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Acionou");
	}

}
