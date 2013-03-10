package strategy.modelo;

import strategy.behavior.QuackBehavior;

public class Squeack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeeack!");
	}

}
