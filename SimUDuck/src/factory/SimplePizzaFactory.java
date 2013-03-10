package factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String tipo){
		Pizza pizza = null;
		
		if(tipo.equals("cheese"))
			pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
		if(tipo.equals("pepperoni"))
			pizza = new PepperoniPizza();
		if(tipo.equals("clam"))
			pizza = new ClamPizza();
		if(tipo.equals("veggie"))
			pizza = new VeggiePizza();

		return pizza;
	}
	
}
