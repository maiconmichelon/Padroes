package strategy.modelo;

import strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}
	
}
