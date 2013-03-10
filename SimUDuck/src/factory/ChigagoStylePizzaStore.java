package factory;

public class ChigagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String tipo) {
		Pizza pizza = null;
		
		if(tipo.equals("cheese"))
			pizza = new ChicagoCheesePizza();
		if(tipo.equals("pepperoni"))
			pizza = new ChicagoPepperoniPizza();
		if(tipo.equals("clam"))
			pizza = new ChicagoClamPizza();
		if(tipo.equals("veggie"))
			pizza = new ChicagoVeggiePizza();

		return pizza;
	}

}
