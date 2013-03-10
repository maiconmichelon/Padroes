package factory;

public class NyStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String tipo) {
		Pizza pizza = null;
		
		if(tipo.equals("cheese"))
			pizza = new NYCheesePizza();
		if(tipo.equals("pepperoni"))
			pizza = new NYPepperoniPizza();
		if(tipo.equals("clam"))
			pizza = new NYClamPizza();
		if(tipo.equals("veggie"))
			pizza = new NYVeggiePizza();

		return pizza;
	}

}
