package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList<MenuItem> itens = new ArrayList<MenuItem>();
	
	public PancakeHouseMenu() {
		addItem("KB pancake breackfast", true, 2.99);
		addItem("Regular pancake breackfast", false, 2.99);
		addItem("Blueberry pancake ", true, 3.49);
		addItem("Waffles", true, 1.60);
	}

	private void addItem(String nome, boolean vegetariano, double valor) {
		itens.add(new MenuItem(nome, vegetariano, valor));
	}
	
	public Iterator createDinerMenuIterator(){
		return new PancakeHouseMenuIterator(itens);
	}
	
}
