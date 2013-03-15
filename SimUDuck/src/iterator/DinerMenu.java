package iterator;

public class DinerMenu {

	public static final int MAX_ITEMS = 6;
	int numeroDeItens = 0;
	private MenuItem[] itens ;
	
	public DinerMenu() {
		itens = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT",true , 2.99);
		addItem("BLT", true, 3.50);
		addItem("Soup of the day ", true, 7);
		addItem("Hot dog", true, 5);
	}

	private void addItem(String nome, boolean vegetariano, double valor) {
		MenuItem menuItem = new MenuItem(nome, vegetariano, valor);
		if(numeroDeItens < MAX_ITEMS){
			itens[numeroDeItens] = menuItem;
			numeroDeItens++;
		}
	}


	public Iterator createDinerMenuIterator(){
		return new DinerMenuIterator(itens);
	}

}
