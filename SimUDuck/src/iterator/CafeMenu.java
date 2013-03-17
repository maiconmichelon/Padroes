package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{

	Hashtable<String, MenuItem> menuItens = new Hashtable<String, MenuItem>();
	
	public CafeMenu() {
		addItem("Viggie burger and air fries", true, 3.99);
		addItem("Soup of day", false, 3.69);
		addItem("Burrito", true, 2.69);
	}

	private void addItem(String nome, boolean vegetariano, double valor) {
		MenuItem menuItem = new MenuItem(nome, vegetariano, valor);
		menuItens.put(menuItem.getNome(), menuItem);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItens.values().iterator();
	}
	
}
