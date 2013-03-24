package myObservable;

import java.util.Observable;

public class ClassObservable extends Observable{

	public void acionar(){
		measurementsChanged();
	}

	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

}
