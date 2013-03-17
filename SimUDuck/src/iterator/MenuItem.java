package iterator;

import java.util.ArrayList;

import composite.MenuComponent;

public class MenuItem extends MenuComponent{

	private String nome;
	private boolean vegetariano;
	private double valor;

	public MenuItem(String nome, boolean vegetariano, double valor) {
		this.nome = nome;
		this.vegetariano = vegetariano;
		this.valor = valor;
	}

	@SuppressWarnings("unchecked")
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
	
	public String getNome() {
		return nome;
	}

	public boolean isVegetarian() {
		return vegetariano;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public void print() {
		System.out.println(getNome());
		System.out.println(isVegetarian() ? "\nVegetariano" + "\nNão vegetariano");
		System.out.println("\n"+getPreco());
	}
	
}
