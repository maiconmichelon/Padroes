package factory;

public class CheesePizza extends Pizza{

	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		pizzaIngredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparando");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		
	}

	@Override
	public void bake() {
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub

	}

	@Override
	public void box() {
		// TODO Auto-generated method stub

	}

}
