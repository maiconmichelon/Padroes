package proxy;

import state.GumballMachine;

public class GumballMonitor {

	GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	public void report(){
		try{
			System.out.println("Gumball machine "+machine.getLocation());
			System.out.println("State "+machine.getState());
			System.out.println("count "+machine.getCount());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
