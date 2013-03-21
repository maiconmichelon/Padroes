package state;

public class SoldState implements State {

	private final GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Espere, estamos entregando a goma");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Desculpe, voce ja puxou a lavanca");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesnt get you gumball");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseGumball();
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("Estamos sem gomas");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
