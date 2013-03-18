package iterator.composite;

import iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	ArrayList menuComponents = new ArrayList();
	String nome;
	
	public Menu(String nome) {
		this.nome = nome;
	}

	@Override
	public void add(MenuComponent menu) {
		menuComponents.add(menu);
	}
	
	@Override
	public void remove(MenuComponent menu) {
		menuComponents.remove(menu);
	}
	
	@Override
	public MenuItem getChild(int i) {
		return (MenuItem) menuComponents.get(i);
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public void print() {
		System.out.println("\n"+getNome());
		System.out.println("----------");
		
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent mc = (MenuComponent) iterator.next();
			
			mc.print();
		}
		
	}
	
}
