package templateComGancho;

public abstract class CaffeineBeverageWithHook {

	void prepareRecipient(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}

	public abstract void addCondiments();

	public boolean customerWantsCondiments() {
		CaffeineBeverageWithHook cp = new CoffeWithHook();
		return true;
	}

	public void pourInCup() {
		System.out.println("Pouring in cup");
	}

	public abstract void brew();

	public void boilWater() {
		System.out.println("Boiling water");
	}
	
}
