package iterator;

public class MenuItem {

	private final String nome;
	private final boolean vegetariano;
	private final double valor;

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
