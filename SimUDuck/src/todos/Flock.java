package todos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{

	private List quackers = new ArrayList<Quackable>();
	private Observable observable;

	public Flock() {
		observable = new Observable(this);
	}
	
	public void add(Quackable quackable) {
		quackers.add(quackable);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()){
			Quackable quackable = iterator.next();
			quackable.quack();
			notifyObserver();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		observable.notifyObserver();
	}

}
