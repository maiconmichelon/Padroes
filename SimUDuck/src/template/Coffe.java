package template;

public class Coffe extends CaffeineBeverage {

	@Override
	void addCondiments() {
		System.out.println("Dripping coffe through filter");
	}

	@Override
	void brew() {
		System.out.println("Adding sugar and milk");
	}

}
