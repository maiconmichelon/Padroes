package iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	
	List<Menu> menus;
	
	public Waitress(List<Menu> menu) {
		menus = menu;
	}

	public void printMenu(){
		for(Menu menu : menus){
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()){
			MenuItem item = MenuItem.class.cast(iterator.next());
			System.out.print(item.getNome());
			System.out.print(item.isVegetariano() ? " -- Vegetariano" : " -- Não vegetariano");
			System.out.println(" -- " + item.getValor());
		}
	}

}
