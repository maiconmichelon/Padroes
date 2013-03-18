package iterator;

import java.util.Iterator;
import java.util.List;

import iterator.composite.MenuComponent;

public class Waitress {
	
	List<Menu> menus;
	private MenuComponent mc;
	
	public Waitress(List<Menu> menu) {
		menus = menu;
	}

	public Waitress(MenuComponent mc){
		this.mc = mc;
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
			System.out.print(item.isVegetarian() ? " -- Vegetariano" : " -- Não vegetariano");
			System.out.println(" -- " + item.getValor());
		}
	}

	public void printMenuMC(){
		mc.print();
	}
	
}
