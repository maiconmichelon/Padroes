package factory;

public class ChicagoCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("preparando chicago cheese pizza");
	}

	@Override
	public void bake() {
		System.out.println("bake chicago cheese pizza");
	}

	@Override
	public void cut() {
		System.out.println("cute chicago cheese pizza");
	}

	@Override
	public void box() {
		System.out.println("colocando na caixa chicago cheese pizza");
	}

}
