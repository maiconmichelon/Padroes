package todos;

public class DuckCall implements Quackable {

	private Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwack");
		notifyObserver();
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
