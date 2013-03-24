package state;

import java.rmi.RemoteException;

public class GumBallMachineTest {

	public static void main(String[] args) throws RemoteException {
		
		GumballMachine gm = new GumballMachine("", 5);
		
		System.out.println(gm);
		
		gm.insertQuarter();
		gm.turnCranck();
		
		System.out.println(gm);
		
		gm.insertQuarter();
		gm.ejectQuarter();
		gm.turnCranck();
		
		System.out.println(gm);
		
		gm.insertQuarter();
		gm.turnCranck();
		gm.insertQuarter();
		gm.turnCranck();
		gm.ejectQuarter();
		
		System.out.println(gm);
		
		gm.insertQuarter();
		gm.insertQuarter();
		gm.turnCranck();
		gm.insertQuarter();
		gm.turnCranck();
		gm.insertQuarter();
		gm.turnCranck();
		
		System.out.println(gm);
		
	}
	
}
