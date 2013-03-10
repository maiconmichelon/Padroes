package factory;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVegies();
	public Pepperonni createPepperoni();
	public Clam createClam();
	
}
