package proxy;

import java.rmi.Naming;

import state.GumballMachine;
import state.GumballMonitor;


public class GumballMachineTestDrive {

//	public static void main(String[] args) {
//		int count = 0;
//		
//		if(args.length < 2){
//			System.out.println("Gumball machine names inventory");
//			System.exit(1);
//		}
//		
//		count = Integer.parseInt(args[1]);
//		GumballMachine gm = new GumballMachine(args[0], count);
//		
//		GumballMonitor monitor = new GumballMonitor(gm);
//		
//		monitor.report();
//	}
	
	public static void main(String[] args) {
		GumballMachineRemote service = null;
		
		int count = 0;
		if(args.length > 2){
			System.out.println("gumball machine <name> <inventory>");
			System.exit(1);
		}
		
		try{
			count = Integer.parseInt(args[1]);
			GumballMachine gm = new GumballMachine(args[0], count);
			Naming.rebind("//"+args[0]+"\\gumballmachine", gm);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
