package todos;

public class MallardDuck implements Quackable{

	private Observable observable;

	public MallardDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("quack");
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
