package template;

public abstract class CaffeineBeverage {

	final void prepareRecipient(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void addCondiments();

	private void pourInCup() {
		CaffeineBeverage cb = new Tea();
		System.out.println("Pouring in cup");
	}

	abstract void brew();

	private void boilWater() {
		System.out.println("Boiling water");
	}
	
}
