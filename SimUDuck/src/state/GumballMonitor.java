package state;

public class GumballMonitor {

	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public void report(){
		System.out.println("location "+ machine.getLocation());
		System.out.println("numero de gomas "+ machine.getCount());
		System.out.println("Estado "+ machine.getState().getClass().getName());
	}
	
}
