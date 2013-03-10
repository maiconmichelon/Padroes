package factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String tipo){
		Pizza pizza = createPizza(tipo);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String tipo);
	
}
