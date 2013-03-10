package strategy.main;

import strategy.modelo.Duck;
import strategy.modelo.FlyRocketPowered;
import strategy.modelo.MallardDuck;
import strategy.modelo.ModelDuck;

public class DuckSimulator {
	
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
