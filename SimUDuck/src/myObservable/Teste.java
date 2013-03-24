package myObservable;

public class Teste {

	public static void main(String[] args) {
		ClassObservable observable = new ClassObservable();
		ClassObserver observer = new ClassObserver();
		
		observer.addObservable(observable);
		observable.acionar();
	}
	
}
