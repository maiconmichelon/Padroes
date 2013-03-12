package template;

public class Tea extends CaffeineBeverage {

	@Override
	void addCondiments() {
		System.out.println("Steeping the tea");
	}

	@Override
	void brew() {
		System.out.println("Adding a lemon");
	}

}
