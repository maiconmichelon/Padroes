package iterator;

public class MenuItem {

	private String nome;
	private boolean vegetariano;
	private double valor;

	public MenuItem(String nome, boolean vegetariano, double valor) {
		this.nome = nome;
		this.vegetariano = vegetariano;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public double getValor() {
		return valor;
	}

}
