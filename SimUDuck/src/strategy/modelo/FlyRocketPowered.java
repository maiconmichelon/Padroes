package strategy.modelo;

import strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Voar voar subir subir como um foguete, nada a ver tio");
	}

}
