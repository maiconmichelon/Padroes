package iterator;

public class Waitress {
	
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator pancake = pancakeHouseMenu.createDinerMenuIterator();
		Iterator diner = dinerMenu.createDinerMenuIterator();
		
		System.out.println("Menu");
		printMenu(pancake);
		System.out.println("\nLunch");
		printMenu(diner);
		
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()){
			MenuItem item = MenuItem.class.cast(iterator.next());
			System.out.print(item.getNome());
			System.out.print(item.isVegetariano() ? " -- Vegetariano" : " -- Não vegetariano");
			System.out.println(" -- " + item.getValor());
		}
	}

}
