package state;

public class WinnerState implements State {

	private final GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("error");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("error");
	}

	@Override
	public void turnCrank() {
		System.out.println("error");
	}

	@Override
	public void dispense() {
		System.out.println("You are winner!! you get two gumballs for your quarter");
		if(gumballMachine.getCount() == 0)
			gumballMachine.setState(gumballMachine.getSoldOutState());
		else{
			gumballMachine.releaseGumball();
			if(gumballMachine.getCount()>0)
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			else{
				System.out.println("OOPs out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}