package todos;

public class RedHeadDuck implements Quackable {

	Observable observable;
	
	@Override
	public void quack() {
		this.observable = new Observable(this);
		System.out.println("Quack");
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
