package factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new MassaGrossa();
	}

	@Override
	public Sauce createSauce() {
		return new MolhoDeTomate();
	}

	@Override
	public Cheese createCheese() {
		return new Mussarela();
	}

	@Override
	public Veggies[] createVegies() {
		Veggies []veggies = {new Beringela(), new Azeitona()};
		return veggies;
	}

	@Override
	public Pepperonni createPepperoni() {
		return new CalabresaFatiada();
	}

	@Override
	public Clam createClam() {
		return new MariscoCongelado();
	}

}
