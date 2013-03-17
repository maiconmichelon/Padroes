package iterator;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));
		waitress.printMenu();
	}
	
}
