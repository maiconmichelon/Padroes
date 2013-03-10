package factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new RegianoCheese();
	}

	@Override
	public Veggies[] createVegies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pepperonni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clam createClam() {
		// TODO Auto-generated method stub
		return null;
	}

}
