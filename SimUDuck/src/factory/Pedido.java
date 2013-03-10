package factory;

public class Pedido {

	public static void main(String[] args) {
		
		PizzaStore pStore = new ChigagoStylePizzaStore();
		pStore.orderPizza("cheese");
		
	}
	
}
