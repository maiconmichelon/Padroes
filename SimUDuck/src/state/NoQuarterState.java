package state;

public class NoQuarterState implements State{
	
	GumballMachine gm;
	
	public NoQuarterState(GumballMachine gm) {
		this.gm = gm;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Moeda inserida");
		gm.setState(gm.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Voc� n�o inseriu a moeda");
	}

	@Override
	public void turnCrank() {
		System.out.println("Voc� n�o pagou");
	}

	@Override
	public void dispense() {
		System.out.println("Voce precisa pagar primeiro");
	}

	
	
}
