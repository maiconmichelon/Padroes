package iterator.composite;

import iterator.MenuItem;

public abstract class MenuComponent {

	public void add(MenuComponent menu){
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menu){
		throw new UnsupportedOperationException();
	}
	
	public MenuItem getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	public String getNome(){
		throw new UnsupportedOperationException();
	}
	
	public String getPreco(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
	
}
