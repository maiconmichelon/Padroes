package todos;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		
		AbstractDuckFactory factory = new CountingDuckFactory();
		simulator.simulateWithObservable(factory);
	}

	private void simulateFactory(AbstractDuckFactory factory) {
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable duckCall = factory.createDuckCall();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator");
		
		simulate(mallardDuck);
		simulate(duckCall);
		simulate(redHeadDuck);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getCount());
	}

	private void simulateWithObservable(AbstractDuckFactory factory) {
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable duckCall = factory.createDuckCall();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator with observable");
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(gooseDuck);

		Quacologist quacologist = new Quacologist();
		flockOfDucks.registerObserver(quacologist);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = factory.createMallardDuck();
		Quackable mallardTwo = factory.createMallardDuck();
		Quackable mallardThree = factory.createMallardDuck();
		
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardOne);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("All Ducks");
		simulate(flockOfDucks);
		System.out.println("Mallard Ducks");
		simulate(flockOfMallards);
		
		
		System.out.println("The ducks quacked " + QuackCounter.getCount());
	}
	
	private void simulateWithComposite(AbstractDuckFactory factory) {
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable duckCall = factory.createDuckCall();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator with composite");
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = factory.createMallardDuck();
		Quackable mallardTwo = factory.createMallardDuck();
		Quackable mallardThree = factory.createMallardDuck();
		
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardOne);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("All Ducks");
		simulate(flockOfDucks);
		System.out.println("Mallard Ducks");
		simulate(flockOfMallards);
		
		
		System.out.println("The ducks quacked " + QuackCounter.getCount());
	}
	
	private void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable goose = new GooseAdapter(new Goose());
		
		System.out.println("Duck simulator");
		
		simulate(mallardDuck);
		simulate(duckCall);
		simulate(redHeadDuck);
		simulate(rubberDuck);
		simulate(goose);
		
		System.out.println(QuackCounter.getCount());
	}

	private void simulate(Quackable quackable) {
		quackable.quack();
	}
	
}
