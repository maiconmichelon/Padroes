package state;

public class SoldOutState implements State {

	private final GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Voce nao pode inserir a moeda, esta sem gomas ");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("voce nao pode ejetar a moeda, voce nao inseriu a moeda");
	}

	@Override
	public void turnCrank() {
		System.out.println("estamos sem gomas");
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");
	}

}
