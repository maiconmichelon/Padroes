package iterator;

import java.util.Iterator;

public class Waitress {
	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator<MenuItem> pancake = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> diner = dinerMenu.createIterator();
		
		System.out.println("Menu");
		printMenu(pancake);
		System.out.println("\nLunch");
		printMenu(diner);
		
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
