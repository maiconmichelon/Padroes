package todos;

public class GooseAdapter implements Quackable {

	private final Goose goose;
	private Observable observable;

	public GooseAdapter(Goose goose) {
		observable = new Observable(this);
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
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
