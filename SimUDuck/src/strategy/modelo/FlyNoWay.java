package strategy.modelo;

import strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("nao posso vuar #chateado");
	}

}
