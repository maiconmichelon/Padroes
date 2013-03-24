package todos;

public class QuackCounter implements Quackable {

	private Quackable duck;
	private Observable observable;
	private static int count;
	
	public QuackCounter(Quackable duck) {
		observable = new Observable(this);
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		count++;
	}
	
	public static int getCount() {
		return count;
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
